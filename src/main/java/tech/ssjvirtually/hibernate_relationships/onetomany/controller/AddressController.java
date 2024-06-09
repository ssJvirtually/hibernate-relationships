package tech.ssjvirtually.hibernate_relationships.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.ssjvirtually.hibernate_relationships.onetomany.entity.Address;
import tech.ssjvirtually.hibernate_relationships.onetomany.service.AddressService;

@RestController
@RequestMapping("/addresses")
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("/create")
    public Address createAddress(@RequestBody Address address) {
        return addressService.createAddress(address);
    }



}
