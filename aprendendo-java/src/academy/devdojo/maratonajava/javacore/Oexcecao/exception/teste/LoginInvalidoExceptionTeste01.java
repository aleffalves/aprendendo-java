package academy.devdojo.maratonajava.javacore.Oexcecao.exception.teste;

import academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTeste01 {
    public static void main(String[] args) {

        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }

    }

    private static void logar() throws LoginInvalidoException {
        Scanner  teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Login: ");
        String usernameDigitado = teclado.nextLine();
        System.out.println("Senha: ");
        String senhaDigitada = teclado.nextLine();
        if(!usernameDB.equals(usernameDigitado) || ! senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException("Usuário ou Senha inválido");
        }

        System.out.println("Usuário logado com sucesso");
    }

}
