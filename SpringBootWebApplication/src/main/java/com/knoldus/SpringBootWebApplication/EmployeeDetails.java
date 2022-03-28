package com.knoldus.SpringBootWebApplication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class EmployeeDetails {

    public  List<Employee> getContactList() {
        List<Employee> listEmployee = new ArrayList<>();

        listEmployee.add(new Employee("Kuldeep", "kuldeep@gmail.com", "USA"));
        listEmployee.add(new Employee("Anuradha", "anuradha@gmail.com", "England"));
        listEmployee.add(new Employee("Sakshi", "sakshi@gmail.com", "Australia"));
        listEmployee.add(new Employee("Agnibhas", "agnibhas@gmail.com", "India"));

        return listEmployee;
    }

}
