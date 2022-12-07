package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.LightDrink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LightDrinkRepository extends JpaRepository<LightDrink, Integer> {
}