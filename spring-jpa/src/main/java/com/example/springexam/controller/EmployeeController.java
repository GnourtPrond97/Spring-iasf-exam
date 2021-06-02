package com.example.springexam.controller;

import com.example.springexam.model.Employee;
import com.example.springexam.respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public Iterable<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }
    @RequestMapping(value = "/create",method = RequestMethod.POST)

    public void createEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
}
