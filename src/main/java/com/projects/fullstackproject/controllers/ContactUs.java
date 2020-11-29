package com.projects.fullstackproject.controllers;

import com.projects.fullstackproject.services.EmailService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/contact-us")
    public String messageSent(@RequestParam(name = "customer-name") String name,
                              @RequestParam(name = "email") String email,
                              @RequestParam(name = "phone") String phone,
                              @RequestParam(name = "message") String message) {
        emailService.prepareAndSend(email,
                "aaronsingleterry10@gmail.com",
                "Question from customer",
                name + "\n" + email + "\n" + phone + "\n" + message);
        return "thanks-for-msg";
    }
}
