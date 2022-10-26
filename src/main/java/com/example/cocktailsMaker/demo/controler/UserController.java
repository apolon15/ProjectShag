package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.dto.UserDto;

import com.example.cocktailsMaker.demo.mapper.UserFromUserDto;
import com.example.cocktailsMaker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller

public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserFromUserDto userFromUserDto;

    /*метод принимает данные из формы и сохраняет пользователя в базу
     * и после возвращает начальную страницу*/

    @Transactional
    @PostMapping("/save/user")
    public String saveUser(@ModelAttribute("user") UserDto userDto) {
        userFromUserDto.userFromUserDto(userDto);
        return "redirect:/bar";
    }

}