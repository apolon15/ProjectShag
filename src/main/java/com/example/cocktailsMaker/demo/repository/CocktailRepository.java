package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail,Integer> {
}