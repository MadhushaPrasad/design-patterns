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
public class WorkExperience extends EmployeeQualification {

    Employee employee;

    public WorkExperience(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        return "Add Work experience.";
    }

    @Override
    public double getSalary() {
        return 20000 + employee.getSalary();
    }
}
