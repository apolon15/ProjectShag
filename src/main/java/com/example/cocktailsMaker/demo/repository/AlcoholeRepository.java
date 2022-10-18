package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.Alcohole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlcoholeRepository extends JpaRepository<Alcohole,Integer > {
}
