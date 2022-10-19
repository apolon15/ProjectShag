package com.example.cocktailsMaker.demo.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormControler {

    @GetMapping("/index")
    public String showMustGoOn() {
        return "index";
    }

    @PostMapping("/bar")
    public String seconPage() {
        return "bar";
    }


}
