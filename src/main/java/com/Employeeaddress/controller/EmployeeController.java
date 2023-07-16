package com.Employeeaddress.controller;

import com.Employeeaddress.model.Employee;
import com.Employeeaddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee-app")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
    }
    @GetMapping("/getEmployee/{number}")
    public Employee getEmployee(@PathVariable Long number){
        return employeeService.getEmployee(number);
    }

    @GetMapping("/getallemployee")
    List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @PutMapping("/update-api/number/{number}")
    public  void updateEmployee(@PathVariable Long number, @RequestBody Employee employee){
        employeeService.updateEmployee(number,employee);
    }

    @DeleteMapping("/deleteemployee/number/{number}")
    public void deleteEmployee(@PathVariable Long number)
    {
        employeeService.deleteEmployee(number);
    }
}
