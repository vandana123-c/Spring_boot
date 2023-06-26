package com.mycompany.conference.controller;

import com.mycompany.conference.model.Registration;
import com.mycompany.conference.model.RegistrationReport;
import com.mycompany.conference.service.RegisterService;
import com.mycompany.conference.service.RegisterserviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.validation.Valid;

@Controller
public class RegistrationController {
	
	@Autowired
	RegisterserviceImpl service;

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute ("registration")Registration registration) {
        return "registration";
    }
    
    @GetMapping("registration/reports")
    @ResponseBody
    public List<RegistrationReport> getRegistrationreport() {
    	return service.findReports();
         
    }
    
    @GetMapping("registrations")
    @ResponseBody
    public List<Registration> getRegistratiocourse() {
    	return service.findAll();
         
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration")
                                              Registration registration,
                                  BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }
        else
        {
        	service.save(registration);
        }

        System.out.println("Registration: " + registration.getName());
        

        return "redirect:registration";
    }

}
