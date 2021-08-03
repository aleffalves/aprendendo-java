package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProduceServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnectionFactoryTeste02 {
    public static void main(String[] args) {
        List<Producer> producers = ProduceServiceRowSet.findByNameJdbcRowSet("MadHouse");
        log.info(producers);
    }
}
