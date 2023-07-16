package com.Employeeaddress.service;

import com.Employeeaddress.model.Employee;
import com.Employeeaddress.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void updateEmployee(Long number, Employee employee) {
        Employee employee1=employeeRepository.findById(number).get();
        employee1.setFirstName(employee.getFirstName());
        employee1.setLastName(employee.getLastName());
        employee1.setAddress(employee.getAddress());
        employeeRepository.save(employee1);
    }

    public void deleteEmployee(Long number) {
        employeeRepository.deleteById(number);
    }

    public Employee getEmployee(Long number) {
        return employeeRepository.findById(number).get();
    }
}
