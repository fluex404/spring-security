package com.fluex404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String createIndex(){
        return "index";
    }
    @GetMapping("/admin/hallo")
    public String createHallo(){
        return "hallo";
    }
    @GetMapping("/admin")
    public String createAdmin(){
        return "admin";
    }
}
