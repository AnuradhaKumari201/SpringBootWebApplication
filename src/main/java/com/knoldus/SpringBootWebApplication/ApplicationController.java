package com.knoldus.SpringBootWebApplication;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ApplicationController {

    @RequestMapping("/list_contact")
    public String listContact(Model model) {

        EmployeeDetails business = new EmployeeDetails();
        List<Employee> contactList = business.getContactList();

        model.addAttribute("contacts", contactList);       

        return "home";
    }


}
