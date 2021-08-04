package academy.devdojo.maratonajava.javacore.ZZKjunit.teste;

import academy.devdojo.maratonajava.javacore.ZZKjunit.dominio.Person;
import academy.devdojo.maratonajava.javacore.ZZKjunit.service.PersonService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class PersonServiceTeste01 {
    public static void main(String[] args) {
        Person person = new Person(20);
        PersonService personService = new PersonService();
        log.info("Is adult? '{}'",personService.isAdult(person));
    }
}
