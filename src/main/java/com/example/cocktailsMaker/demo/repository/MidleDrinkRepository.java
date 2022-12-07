package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.MidleDrink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MidleDrinkRepository extends JpaRepository<MidleDrink, Integer> {

}