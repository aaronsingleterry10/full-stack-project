package com.projects.fullstackproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GunsmithingController {

    @GetMapping("/gunsmith-services")
    public String gunsmithingPage() {
        return "gunsmith-services";
    }

    @GetMapping("/ar15")
    public String ar15Services() {
        return "gunsmith-services/ar15";
    }

    @GetMapping("/ak47")
    public String ak47Services() {
        return "gunsmith-services/ak47";
    }

    @GetMapping("/misc")
    public String miscServices() {
        return "gunsmith-services/misc";
    }
}
