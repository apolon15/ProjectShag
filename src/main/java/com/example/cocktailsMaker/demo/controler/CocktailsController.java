package com.example.cocktailsMaker.demo.controler;


import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.Cocktail;
import com.example.cocktailsMaker.demo.security.PersonDetails;
import com.example.cocktailsMaker.demo.service.implem.CocktailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
public class CocktailsController {
    @Autowired
    private CocktailServiceImpl cocktailService;

    @PostMapping("/create_cocktails")
    public String createCoctails(@ModelAttribute("cocktail") CocktailDto cocktailDto, Model model, @ModelAttribute("userDto") UserDto userDto) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UsernamePasswordAuthenticationToken uToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials());
            model.addAttribute("name_top", authentication.getName());
        }
        model.addAttribute("user", new UserDto());
        model.addAttribute("cocktail", new CocktailDto());
        List<Cocktail> coct = cocktailService.findCoctailsByIngr(cocktailDto);
        cocktailService.getPageBar(model);
        return "bar";
    }


}
