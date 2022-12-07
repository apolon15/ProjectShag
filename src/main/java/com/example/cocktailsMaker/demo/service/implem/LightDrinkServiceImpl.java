package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.models.LightDrink;
import com.example.cocktailsMaker.demo.repository.LightDrinkRepository;
import com.example.cocktailsMaker.demo.service.LightDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LightDrinkServiceImpl implements LightDrinkService{
   @Autowired
   private LightDrinkRepository lightDrinkRepository;

    @Override
    public List<LightDrink> findAll() {
        List<LightDrink>listL=lightDrinkRepository.findAll();
        return listL;
    }
}
