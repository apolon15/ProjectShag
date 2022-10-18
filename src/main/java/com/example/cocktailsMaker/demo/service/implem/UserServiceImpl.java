package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.repository.UserRepository;
import com.example.cocktailsMaker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
