package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.Syrups;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SyrupsRepository extends JpaRepository<Syrups,Integer> {
}