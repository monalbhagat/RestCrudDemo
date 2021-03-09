package com.demo.service;

import com.demo.model.Employee;

import java.util.List;

/**
 * Created by Monal Bhagat on 08-03-2021.
 */

public interface EmployeeService {
    List<Employee> findEmployeeByEmployeeNameStartingWith(String name); // fetch list of Employee which start with
    List<Employee> findEmployeeByEmployeeRole(String role);         // fetch Employee by role
    List<Employee> findAll();
    Employee save(Employee employee);
    void delete(long employeeId);
}
