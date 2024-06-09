package tech.ssjvirtually.hibernate_relationships.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Address;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Person;
import tech.ssjvirtually.hibernate_relationships.onetomany.repo.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public Person updatePersonAddress(int personId, Address newAddress) {
        // Step 1: Retrieve the Person entity from the database
        Person person = personRepository.findById(personId)
                .orElseThrow(() -> new RuntimeException("Person not found"));

        // Step 2: Update the Address of the Person
        person.setAddress(newAddress);

        // Step 3: Save the updated Person entity
        return personRepository.save(person);
    }

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPerson(String name) {
        return personRepository.findByName(name);
    }

    public Address getPersonAddress(int id) {
        return personRepository.findById(id).get().getAddress();
    }
}
