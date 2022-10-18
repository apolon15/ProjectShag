package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
