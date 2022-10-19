package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.models.Users;
import com.example.cocktailsMaker.demo.repository.UsersRepository;
import com.example.cocktailsMaker.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;

public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository userRepository;

    @Override
    public Users saveUser(Users user) {
        return userRepository.save(user);
    }
}
