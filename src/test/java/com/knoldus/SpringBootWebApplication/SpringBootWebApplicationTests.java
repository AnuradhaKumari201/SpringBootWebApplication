package com.knoldus.SpringBootWebApplication;


import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringBootWebApplicationTests {

    @Autowired
    EmployeeDetails employeeDetails;

    Employee employee1 = new Employee("Kuldeep", "kuldeep@gmail.com", "USA");
    Employee employee2 = new Employee("Anuradha", "anuradha@gmailcom", "England");
    Employee employee3 = new Employee("Sakshi", "sakshi@gmail.com", "Australia");
    Employee employee4 = new Employee("Agnibhas", "agnibhas@gmail.com", "India");

    ArrayList<Employee> listEmployee = new ArrayList<Employee>();

    @Before
    public void initInputs(){
        listEmployee.add(employee1);
        listEmployee.add(employee2);
        listEmployee.add(employee3);
        listEmployee.add(employee4);    
    }


    @Test
    void contextLoads() {

        /**
         * convert List of objects to array of objects
         */
        List<Employee> testOutput = employeeDetails.getContactList();
        Assert.assertEquals(testOutput, testOutput);

    }

}
