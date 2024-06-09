package tech.ssjvirtually.hibernate_relationships.onetomany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Address;
import tech.ssjvirtually.hibernate_relationships.onetomany.repo.AddressRepository;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }


    public Address updateAddress(Address address) {
        return addressRepository.save(address);
    }

}
