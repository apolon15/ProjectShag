package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.models.MidleDrink;
import com.example.cocktailsMaker.demo.repository.MidleDrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface MidleDrinkService {

    List<MidleDrink> findAll();
}
