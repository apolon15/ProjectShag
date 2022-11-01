package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.dto.UserDto;

import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.service.CocktailService;
import com.example.cocktailsMaker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private CocktailService cocktailService;


    /*метод принимает данные из формы и сохраняет пользователя в базу
     * и после возвращает начальную страницу*/
    @PostMapping("/save/user")
    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
        User user = userService.saveUser(userDto);
        return "redirect:/save/user/" + user.getId();
    }

    @GetMapping("/save/user/{id}")
    public String getRedirectPage(@PathVariable(required = false) Integer id, Model model) {
        UserDto userDto = userService.getUserById(id);
        model.addAttribute("user", userDto);
        model.addAttribute("name_top", userDto.getName());
        cocktailService.getPageBar(model);
        return "bar";
    }
}