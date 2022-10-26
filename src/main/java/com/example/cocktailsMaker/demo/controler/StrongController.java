package com.example.cocktailsMaker.demo.controler;


import com.example.cocktailsMaker.demo.repository.StrongDrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StrongController {
    @Autowired
    private StrongDrinkRepository strongRepository;

}
