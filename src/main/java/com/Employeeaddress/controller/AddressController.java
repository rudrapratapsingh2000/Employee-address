package com.Employeeaddress.controller;

import com.Employeeaddress.model.Address;
import com.Employeeaddress.model.Employee;
import com.Employeeaddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address-app")
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("/add-address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }

    @GetMapping("/getalladdress")
    List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }
    @PutMapping("/update-api/number/{number}")
    public  void updateAddress(@PathVariable Long number, @RequestBody Address address){
        addressService.updateAddress(number,address);
    }

    @DeleteMapping("/deleteaddress/number/{number}")
    public void deleteAddress(@PathVariable Long number)
    {
        addressService.deleteAddress(number);
    }
    @GetMapping("/getaddress/{number}")
    public Address getAddress(@PathVariable Long number){
        return addressService.getAddress(number);
    }
}
