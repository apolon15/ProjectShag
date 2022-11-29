package com.example.cocktailsMaker.demo.controler;


import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.service.implem.CocktailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CocktailsController {
    @Autowired
    private CocktailServiceImpl cocktailService;

    @PostMapping("/create_cocktails")
    public String createCoctails(@ModelAttribute("cocktail") CocktailDto cocktailDto, Model model) {
        cocktailService.getPageBar(model);
        return "bar";
    }


}
