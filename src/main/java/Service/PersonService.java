package Service;

import Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {
    
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(Long id){
        logger.info("finding one person");

        Person person = new Person();
        person.setId((counter.incrementAndGet()));
        person.setFirstName("Lucas");
        person.setLastName("Magalhaes");
        person.setAddress("Brasilia");
        person.setGender("Male");

        return person;
    }
}
