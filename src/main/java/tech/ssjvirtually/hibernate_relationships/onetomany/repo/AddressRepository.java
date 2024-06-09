package tech.ssjvirtually.hibernate_relationships.onetomany.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}
