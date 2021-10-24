/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pattern.decorator;

/**
 *
 * @author Madhusha Prasad
 */
public class EmployeeCertification extends EmployeeQualification {

    Employee employee;

    public EmployeeCertification(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        return " Employee Certification ";
    }

    @Override
    public double getSalary() {
        return 30000 + employee.getSalary();
    }

}
