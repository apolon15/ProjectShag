package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.MidleDrink;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MidleDrinkRepository extends JpaRepository<MidleDrink,Integer> {
}