package com.demo.dao;

import com.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Monal Bhagat on 08-03-2021.
 */

@Repository
@Transactional
public interface EmployeeDAO extends JpaRepository<Employee,Long> {

    List<Employee> findEmployeeByEmployeeNameStartingWith(String name);		
    List<Employee> findEmployeeByEmployeeRole(String role);	
    List<Employee> findAll();	
}
