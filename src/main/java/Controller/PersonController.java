package Controller;

import Model.Person;
import Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    public Person listar(){
        return personService
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable Long id){
        return personService.findById(id);
    }
}
