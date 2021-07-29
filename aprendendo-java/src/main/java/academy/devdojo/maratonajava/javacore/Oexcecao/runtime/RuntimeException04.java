package academy.devdojo.maratonajava.javacore.Oexcecao.runtime;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeException04 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException |  ArithmeticException e ){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch (IllegalAccessError e) {

        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }


        try {
            talvezLanceException();
        }catch (SQLException | FileNotFoundException e){
            e.printStackTrace();

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}

