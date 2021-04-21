package academy.devdojo.maratonajava.javacore.Oexcecao.exception.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando Leitor 1");
    }
}
