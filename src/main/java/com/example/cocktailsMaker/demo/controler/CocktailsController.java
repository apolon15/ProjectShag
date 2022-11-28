package com.example.cocktailsMaker.demo.controler;


import com.example.cocktailsMaker.demo.service.implem.CocktailServiceImpl;
import org.hibernate.type.ObjectType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CocktailsController {
    @Autowired
    private CocktailServiceImpl cocktailService;

    @PostMapping("/create_cocktails")
    public String createCoctails(@ModelAttribute("value" ) String s3, Model model) {

        cocktailService.getPageBar(model);
        System.out.println(s3);
        return "bar";
    }


}
