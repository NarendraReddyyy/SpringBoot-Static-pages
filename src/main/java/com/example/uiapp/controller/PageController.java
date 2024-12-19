package com.example.uiapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String defaultPage() {
        return "layout"; // This maps to src/main/resources/templates/layout.html
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/products")
    public String products() {
        return "products";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/faq")
    public String faq() {
        return "faq";
    }

    @GetMapping("/careers")
    public String careers() {
        return "careers";
    }

    @GetMapping("/testimonials")
    public String testimonials() {
        return "testimonials";
    }

    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }
}
