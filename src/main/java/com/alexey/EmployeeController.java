package com.alexey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private SendEmail sendEmail;
    @Autowired
    public EmployeeController(SendEmail sendEmail) {
        this.sendEmail = sendEmail;
    }

    @RequestMapping("/")
    public String mainPage(Model model){
        model.addAttribute("employee", new Employee());
        return "main";
    }

    @RequestMapping("/show")
    public String showDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult result){
        if(!result.hasErrors()) {
            sendEmail.mailSend(employee);
            return "show";
        } else {
            return "main";
        }
    }


}
