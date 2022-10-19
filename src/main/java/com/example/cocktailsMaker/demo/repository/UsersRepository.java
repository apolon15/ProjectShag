package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,Integer> {
}