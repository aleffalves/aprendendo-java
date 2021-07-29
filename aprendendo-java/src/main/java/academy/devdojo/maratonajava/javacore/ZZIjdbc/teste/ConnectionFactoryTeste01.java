package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.conn.ConnectionFactory;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTeste01 {
    public static void main(String[] args) {
        Producer producer = Producer.ProducerBuilder.builder()
                .name("NHJ").build();
        ProducerRepository.save(producer);
    }
}
