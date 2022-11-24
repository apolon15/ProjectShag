package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findUserByName(String name);

    User findByMail(String mail);
}
