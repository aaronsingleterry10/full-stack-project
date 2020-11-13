package com.projects.fullstackproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GunsmithingController {

    @GetMapping("/gunsmithing")
    public String gunsmithingPage() {
        return "gunsmith-services";
    }
}
