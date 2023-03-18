package Service;

import Exceptions.ResourceNotFoundException;
import Model.Person;
import Repositorys.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;
    private Logger logger = Logger.getLogger(PersonService.class.getName());


    public List<Person> findAll(){
        logger.info("finding all peaple");

        return personRepository.findAll();
    }



    public Person findById(Long id){
        logger.info("finding one person");


        return personRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for the id"));
    }

    public  Person update(Person person) {
        logger.info("creating one person");
        return person;
    }

    public void delete(Long id) {
        logger.info("deleting one person");
    }

    public  Person create(Person person) {

        logger.info("creating one person");
        return person;
    }


    private Person mockPerson(int i) {


        Person person = new Person();
        person.setId((counter.incrementAndGet()));
        person.setFirstName(" First name" + i);
        person.setLastName("last name" + i);
        person.setAddress("some address in Brasil" + i);
        person.setGender(" male");

        return person;
    }

}
