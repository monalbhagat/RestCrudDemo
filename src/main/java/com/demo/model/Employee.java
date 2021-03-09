package com.demo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * Created by Monal Bhagat on 08-03-2021.
 */

@Entity
@Table(name = "employee")
public class Employee {

    @Id                                                 
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    @Column(name = "employeeId")
    private long employeeId;

    @NotEmpty
    @Size(min = 2, message = "EmployeeName should have at least 2 characters")
    @Column(name = "employeeName")
    private String employeeName;

    @NotEmpty
    @Size(min = 3, message = "EmployeeRole should have at least 3 characters")
    @Column(name = "employeeRole")
    private String employeeRole;

    @NotEmpty
    @Email
    @Column(name = "employeeEmail")
    private String employeeEmail;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeRole() {
        return employeeRole;
    }

    public void setEmployeeRole(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }
}
