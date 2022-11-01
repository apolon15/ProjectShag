package com.example.cocktailsMaker.demo.repository;

import com.example.cocktailsMaker.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    User findByMail(String mail);

}
