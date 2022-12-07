package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.models.Cocktail;
import org.springframework.ui.Model;

import java.util.List;

public interface CocktailService{
    Cocktail saveCocktail(Cocktail cocktail);

    void getPageBar(Model model);

    List<Cocktail> findCocktailsByIngr(CocktailDto cocktailDto);

    Cocktail findCocktailById(Integer id);

}
