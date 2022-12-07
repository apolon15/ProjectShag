package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.dto.CocktailDto;
import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.LightDrink;
import com.example.cocktailsMaker.demo.models.MidleDrink;
import com.example.cocktailsMaker.demo.models.StrongDrink;
import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.repository.LightDrinkRepository;
import com.example.cocktailsMaker.demo.repository.MidleDrinkRepository;
import com.example.cocktailsMaker.demo.repository.StrongDrinkRepository;
import com.example.cocktailsMaker.demo.service.implem.CocktailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
public class FormController {

    @Autowired
    private MidleDrinkRepository midleDrinkRepository;
    @Autowired
    private StrongDrinkRepository strongRepository;
    @Autowired
    private LightDrinkRepository lightDrinkRepository;


//    @GetMapping("/bar/{id}")
//    public String showSyrups(Model model, @PathVariable(required = false) Integer id) {
//        cocktailService.getPageBar(model);
//        return "bar";
//    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }


    /* метод при переходе на страницу index подгружает из таблицы все напитки и алко*/

    @GetMapping("/bar/without/reg")
    public String barPage( Model model) {
        model.addAttribute("user", new UserDto());
        model.addAttribute("cocktail", new CocktailDto());
        List<MidleDrink> listMidleDrink = midleDrinkRepository.findAll();
        List<StrongDrink> listStrongDring = strongRepository.findAll();
        List<LightDrink> listLightDrink = lightDrinkRepository.findAll();
        model.addAttribute("listMD", listMidleDrink);
        model.addAttribute("listSD", listStrongDring);
        model.addAttribute("listLD", listLightDrink);
        return "bar";
    }

    @GetMapping("/reg")
    public String regPage(@ModelAttribute("user") User user) {
        return "reg";
    }

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "login";
    }
}