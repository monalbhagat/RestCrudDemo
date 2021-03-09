package com.demo.service;

import com.demo.dao.EmployeeDAO;
import com.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * Created by Monal Bhagat on 08-03-2021.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public List<Employee> findEmployeeByEmployeeNameStartingWith(String name) {
        return employeeDAO.findEmployeeByEmployeeNameStartingWith(name);
    }

    @Override
    public List<Employee> findEmployeeByEmployeeRole(String role) {
        return employeeDAO.findEmployeeByEmployeeRole(role);
    }

    @Override
    public void delete(long employeeId) {
        Employee employee = employeeDAO.findOne(employeeId);
        employeeDAO.delete(employee);
    }

    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }
}
