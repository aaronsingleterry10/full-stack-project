package com.projects.fullstackproject.controllers;

import com.projects.fullstackproject.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactUs {

    private final EmailService emailService;

    public ContactUs(EmailService emailService) {
        this.emailService = emailService;
    }

    @GetMapping("/contact-us")
    public String contactUsPage() {
        return "contact-us";
    }
}
