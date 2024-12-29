package com.example.hw_spring_04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    private String message = "Привет, мир!";
    @RequestMapping
    public String hello(Model model) {
        model.addAttribute("message", message);
        return "hello.html";
    }

    @RequestMapping("/welcome")
    public String welcome(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", "Welcome " + name);
        return "welcome.html";
    }
}
