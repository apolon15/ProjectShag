package com.example.cocktailsMaker.demo.mapper;

import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserFromUserDto {

    @Autowired
    private UserService userService;

    public void userFromUserDto(UserDto userDto){
        User user=new User();
        user.setId(userDto.getId());
        user.setName(userDto.getName());
        user.setMail(userDto.getMail());
        user.setPass(userDto.getPass());
        userService.saveUser(user);
    }


}
