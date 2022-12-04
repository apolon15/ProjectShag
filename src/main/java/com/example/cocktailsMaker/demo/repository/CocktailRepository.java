package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CocktailRepository extends JpaRepository<Cocktail,Integer> {

    List<Cocktail> findAllByStructureIsLike(String str);
}