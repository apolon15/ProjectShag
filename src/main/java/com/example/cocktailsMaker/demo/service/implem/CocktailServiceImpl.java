package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.models.Cocktail;
import com.example.cocktailsMaker.demo.models.LightDrink;
import com.example.cocktailsMaker.demo.models.MidleDrink;
import com.example.cocktailsMaker.demo.models.StrongDrink;
import com.example.cocktailsMaker.demo.repository.LightDrinkRepository;
import com.example.cocktailsMaker.demo.repository.MidleDrinkRepository;
import com.example.cocktailsMaker.demo.repository.StrongDrinkRepository;
import com.example.cocktailsMaker.demo.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
@Service
public class CocktailServiceImpl implements CocktailService {

    @Autowired
    private MidleDrinkRepository midleDrinkRepository;
    @Autowired
    private StrongDrinkRepository strongRepository;
    @Autowired
    private LightDrinkRepository lightDrinkRepository;


    @Override
    public Cocktail saveCocktail(Cocktail cocktail) {
        return null;
    }
    @Override
    public void getPageBar(Model model){
        List<MidleDrink> listMidleDrink = midleDrinkRepository.findAll();
        List<StrongDrink> listStrongDring = strongRepository.findAll();
        List<LightDrink> listLightDrink = lightDrinkRepository.findAll();
        model.addAttribute("listMD", listMidleDrink);
        model.addAttribute("listSD", listStrongDring);
        model.addAttribute("listLD", listLightDrink);
    }
}
