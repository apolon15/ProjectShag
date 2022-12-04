package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.security.PersonDetails;
import com.example.cocktailsMaker.demo.service.CocktailService;
import com.example.cocktailsMaker.demo.service.UserService;
import com.example.cocktailsMaker.demo.util.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserValidator userValidator;

    @Autowired
    private CocktailService cocktailService;


    /*метод принимает данные из формы и сохраняет пользователя в базу
     * и после возвращает начальную страницу*/
    @PostMapping("/save/user")
    public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult bindingresult) {
        userValidator.validate(user, bindingresult);
        if (bindingresult.hasErrors()) return "/reg";
        userService.registerUser(user);
        return "redirect:/login";
//        return "redirect:/save/user/" + user.getId();
    }

//    @PostMapping("/save/user")
//    public String saveUser(@ModelAttribute("user") UserDto userDto, Model model) {
//        User user = userService.saveUser(userDto);
//        return "redirect:/save/user/" + user.getId();
//    }

    @GetMapping("/login/user")
    public String loginUser(@ModelAttribute("cocktail") CocktailDto cocktailDto, Model model) {
//        User user = userService.saveUser(userDto);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        PersonDetails personDetails = (PersonDetails) authentication.getPrincipal();
        model.addAttribute("name_top", personDetails.getUsername());
        cocktailService.getPageBar(model);
//        return "redirect:/save/user/" + user.getId();

        return "/bar";
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