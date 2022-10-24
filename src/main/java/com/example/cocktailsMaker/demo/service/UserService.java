package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User saveUser(User user);
}
