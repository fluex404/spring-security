package com.fluex404.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String createIndex(){
        return "index";
    }
    @RequestMapping("/hallo")
    public String createHallo(){
        return "hallo";
    }
}
