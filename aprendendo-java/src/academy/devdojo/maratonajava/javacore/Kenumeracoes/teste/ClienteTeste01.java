package academy.devdojo.maratonajava.javacore.Kenumeracoes.teste;

import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenumeracoes.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Alex", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);


        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente);
        TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNomeRelatorio(" Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
