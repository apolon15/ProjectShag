package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.models.Cocktail;
import org.springframework.ui.Model;

public interface CocktailService{
    Cocktail saveCocktail(Cocktail cocktail);

    void getPageBar(Model model);
}
