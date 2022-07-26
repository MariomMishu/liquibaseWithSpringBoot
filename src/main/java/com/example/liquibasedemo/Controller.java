package com.example.liquibasedemo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "person", produces = MediaType.APPLICATION_JSON_VALUE)
public class Controller {

    private final PersonRepository personRepository;

    public Controller(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping(value="add")
    public void create(@RequestParam String name) {
        Person person = new Person();
        person.setName(name);
        person.setHeight("5.5");
        personRepository.save(person);

    }

    @GetMapping(value="persons")
    public List<Person> getAllPerson() {

        return (List<Person>) personRepository.findAll();
    }
}
