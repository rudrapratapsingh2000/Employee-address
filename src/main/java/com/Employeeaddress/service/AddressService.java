package com.Employeeaddress.service;

import com.Employeeaddress.model.Address;
import com.Employeeaddress.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public void addAddress(Address address) {
        addressRepository.save(address);
    }

    public List<Address> getAllAddress() {
        return addressRepository.findAll();
    }

    public void updateAddress(Long number, Address address) {
        Address address1=addressRepository.findById(number).get();
        address1.setCity(address.getCity());
        address1.setState(address.getState());
        address1.setStreet(address.getStreet());
        address1.setZipcode(address.getZipcode());
        addressRepository.save(address1);
    }

    public void deleteAddress(Long number) {
        addressRepository.deleteById(number);
    }

    public Address getAddress(Long number) {
        return addressRepository.findById(number).get();
    }
}
