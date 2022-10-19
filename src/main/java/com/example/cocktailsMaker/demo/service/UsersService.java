package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.models.Users;
import org.springframework.stereotype.Component;

public interface UsersService {

    Users saveUser(Users user);
}
