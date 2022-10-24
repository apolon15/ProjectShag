package com.example.cocktailsMaker.demo.controler;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class FormController {
    @PostMapping("/index")
    public String showMustGoOn() {
        return "index";
    }

    @GetMapping("/bar")
    public String secondPage() {
        return "bar";
    }


//        @GetMapping("/test")
//        public String test(Model model, Users users) {
//            users = new Users(2, "Igor");
//            model.addAttribute("user", users);
//            return "test";

}