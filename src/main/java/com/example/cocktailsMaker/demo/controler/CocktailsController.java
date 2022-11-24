package com.example.cocktailsMaker.demo.controler;


import com.example.cocktailsMaker.demo.service.implem.CocktailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CocktailsController {
    @Autowired
    private CocktailServiceImpl cocktailService;

    @PostMapping("/create_cocktails")
    public String createCoctails( Model model) {
        cocktailService.getPageBar(model);


        return "bar";
    }


}
