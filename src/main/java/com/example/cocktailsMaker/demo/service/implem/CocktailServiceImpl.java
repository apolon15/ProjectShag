package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.models.Cocktail;
import com.example.cocktailsMaker.demo.models.LightDrink;
import com.example.cocktailsMaker.demo.models.MidleDrink;
import com.example.cocktailsMaker.demo.models.StrongDrink;
import com.example.cocktailsMaker.demo.repository.CocktailRepository;
import com.example.cocktailsMaker.demo.repository.LightDrinkRepository;
import com.example.cocktailsMaker.demo.repository.MidleDrinkRepository;
import com.example.cocktailsMaker.demo.repository.StrongDrinkRepository;
import com.example.cocktailsMaker.demo.service.CocktailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CocktailServiceImpl implements CocktailService {

    @Autowired
    private MidleDrinkRepository midleDrinkRepository;
    @Autowired
    private StrongDrinkRepository strongRepository;
    @Autowired
    private LightDrinkRepository lightDrinkRepository;

    @Autowired
    private CocktailRepository repository;


    @Override
    public Cocktail saveCocktail(Cocktail cocktail) {
        return null;
    }

    @Override
    public void getPageBar(Model model) {
        List<MidleDrink> listMidleDrink = midleDrinkRepository.findAll();
        List<StrongDrink> listStrongDring = strongRepository.findAll();
        List<LightDrink> listLightDrink = lightDrinkRepository.findAll();
        model.addAttribute("listMD", listMidleDrink);
        model.addAttribute("listSD", listStrongDring);
        model.addAttribute("listLD", listLightDrink);
    }

    @Override
    public List<Cocktail> findCoctailsByIngr(CocktailDto cocktailDto) {
        List<Cocktail> list = new ArrayList<>();
        Set<Cocktail> cocktails = new HashSet<>();
        Set<String> ingr = prepareIngr(cocktailDto);
        if (!ingr.isEmpty()) {
            for (String ingrd : ingr) {
                cocktails.addAll(repository.findAllByStructureContaining(ingrd));
            }
            list = new ArrayList<>(cocktails);
        }
        return list;
    }

    private Set<String> prepareIngr(CocktailDto cocktailDto) {
        Set<String> ingr = new HashSet<>();
        if (cocktailDto != null) {
            ingr.addAll(cocktailDto.getLightDrinks());
            ingr.addAll(cocktailDto.getMidleDrinks());
            ingr.addAll(cocktailDto.getStrongDrinks());
        }
        return ingr;
    }
}
