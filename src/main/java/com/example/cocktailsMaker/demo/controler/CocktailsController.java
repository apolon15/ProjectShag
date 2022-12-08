package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.Cocktail;
import com.example.cocktailsMaker.demo.service.implem.CocktailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
        List<Cocktail> coct = cocktailService.findCocktailsByIngr(cocktailDto);
        model.addAttribute("user", new UserDto());
        model.addAttribute("cocktail", new CocktailDto());
        model.addAttribute("listCocktails", coct);
        cocktailService.getPageBar(model);
        return "bar";
    }

    @PostMapping("/get_cocktail")
    public String getCocktail(@RequestParam Integer id, Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            UsernamePasswordAuthenticationToken uToken = new UsernamePasswordAuthenticationToken(authentication.getPrincipal(), authentication.getCredentials());
            model.addAttribute("name_top", authentication.getName());
        }
        Cocktail cocktail = cocktailService.findCocktailById(id);
        model.addAttribute("cocktail", cocktail);
        return "cocktail";
    }

}
