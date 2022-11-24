package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    int dtoToUser(UserDto userDto);

    User saveUser(UserDto user);

    public UserDto getUserById(Integer id);

    public void registerUser(User user);


}
