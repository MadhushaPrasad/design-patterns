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
public class TestPattern {

    public static void main(String[] args) {

        Employee employee = new Engineer();
        employee = new EmployeeCertification(employee);
        employee = new WorkExperience(employee);

        System.out.println(employee.description + " " + employee.getSalary());

        Employee employee2 = new Consultant();
        employee2 = new WorkExperience(new EmployeeCertification(employee2));

        System.out.println(employee2.description + " " + employee2.getSalary());

        System.out.println("PM salary = "
                + new WorkExperience(new EmployeeCertification(new Manager()))
                        .getSalary());

    }

}
