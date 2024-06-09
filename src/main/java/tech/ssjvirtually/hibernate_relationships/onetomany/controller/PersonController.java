package tech.ssjvirtually.hibernate_relationships.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Address;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Person;
import tech.ssjvirtually.hibernate_relationships.onetomany.service.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;



    //write method to get person
    @GetMapping("/{name}")
    public Person getPerson(@PathVariable String name) {
        return personService.getPerson(name);
    }

    @GetMapping("/{id}/address")
    public Address getPersonAddress(@PathVariable int id) {
        return personService.getPersonAddress(id);
    }

    @PutMapping("/{id}/address")
    public Person updateAddress(@PathVariable int id, @RequestBody Address newAddress) {
        return personService.updatePersonAddress(id, newAddress);
    }


    @PostMapping("/create")
    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }
}
