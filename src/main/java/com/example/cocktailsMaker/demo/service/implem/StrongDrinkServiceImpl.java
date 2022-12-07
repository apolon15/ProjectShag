package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.models.StrongDrink;
import com.example.cocktailsMaker.demo.repository.MidleDrinkRepository;
import com.example.cocktailsMaker.demo.repository.StrongDrinkRepository;
import com.example.cocktailsMaker.demo.service.StrongDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StrongDrinkServiceImpl implements StrongDrinkService {
    @Autowired
    private StrongDrinkRepository strongDrinkRepository;

    @Override
    public List<StrongDrink> findAll() {
        List<StrongDrink>listS=strongDrinkRepository.findAll();
        return listS;
    }
}
