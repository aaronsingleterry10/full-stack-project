package com.projects.fullstackproject.controllers;

import com.projects.fullstackproject.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutUsController {

    private final EmailService emailService;

    public AboutUsController(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/about-us")
    public String aboutUsPage() {
//        emailService.prepareAndSend("aaronsingleterry10@gmail.com", "this is a test", "Hello from About Us");
        return "about-us";
    }
}
