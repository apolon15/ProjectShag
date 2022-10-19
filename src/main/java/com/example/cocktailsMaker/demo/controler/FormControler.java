package com.example.cocktailsMaker.demo.controler;


import com.example.cocktailsMaker.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormControler {

@GetMapping("/index")
    public String showMustGoOn(){
    return "index";
}
}
