package academy.devdojo.maratonajava.javacore.ZZIjdbc.teste;

import academy.devdojo.maratonajava.javacore.ZZIjdbc.dominio.Producer;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.ZZIjdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

import java.util.List;
@Log4j2
public class ConnectionFactoryTeste01 {
    public static void main(String[] args) {
        Producer producer = Producer.builder().name("Studio Deen").build();
        Producer producerToUpdate = Producer.builder().id(4).name("DreamWorks").build();
        List<Producer> producers = ProducerService.findAll();
//        List<Producer> producers1 = ProducerService.findByName("Mad");
//        ProducerService.save(producer);
//        ProducerService.delete(1);
//        ProducerService.update(producerToUpdate);
//        log.info("Producers found '{}'", producers1);
        log.info("Producers found '{}'", producers);
    }
}
