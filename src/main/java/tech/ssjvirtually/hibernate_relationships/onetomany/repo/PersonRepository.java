package tech.ssjvirtually.hibernate_relationships.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person findByName(String name);
}
