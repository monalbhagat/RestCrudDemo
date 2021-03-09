package com.demo.controller;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Created by Monal Bhagat on 08-03-2021.
 */
@RestController    
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // to add new employee
    @RequestMapping(value = "save",method = RequestMethod.POST)     
    public Employee save(Employee employee){
        return employeeService.save(employee);
    }

    // list of all employee
    @RequestMapping(value = "listEmployee",method = RequestMethod.GET)   
    public java.util.List<Employee> listEmployee() {
        return employeeService.findAll();
    }

    // delete specific employee using employee id
    @RequestMapping(value = "delete", method = RequestMethod.DELETE)      
    public void delete(@RequestParam("id")long id){
         employeeService.delete(id);
    }

    // search employee start with name
    @RequestMapping(value = "startWithName/{name}")
    public java.util.List<Employee> findByName(@PathVariable("name")String name){
        return employeeService.findEmployeeByEmployeeNameStartingWith(name);
    }

    // search employee by role
    @RequestMapping(value = "findByRole/{role}")
    public java.util.List<Employee> findByRole(@PathVariable("role")String role){
        return employeeService.findEmployeeByEmployeeRole(role);
    }
}
