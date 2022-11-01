package com.example.cocktailsMaker.demo.repository;


import com.example.cocktailsMaker.demo.models.StrongDrink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StrongDrinkRepository extends JpaRepository<StrongDrink,Integer > {
}