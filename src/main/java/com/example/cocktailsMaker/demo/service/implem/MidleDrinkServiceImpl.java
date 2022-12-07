package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.models.MidleDrink;
import com.example.cocktailsMaker.demo.repository.MidleDrinkRepository;
import com.example.cocktailsMaker.demo.service.MidleDrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MidleDrinkServiceImpl implements MidleDrinkService {


    @Autowired
    private MidleDrinkRepository midleDrinkRepository;

    @Override
    public List<MidleDrink> findAll() {
        List<MidleDrink> listM = midleDrinkRepository.findAll();
        return listM;
    }
}
