package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class UserController {

    @Autowired
    private UserService userService;

    /*метод принимает данные из формы и сохраняет пользователя в базу
     * и после возвращает начальную страницу*/
    @PostMapping("/save/user")
    public String saveUser(@RequestParam String email, @RequestParam String psw, Model model ) {
        User user= new User(psw,email);
        userService.saveUser(user);
        return "redirect:/index";
    }

}