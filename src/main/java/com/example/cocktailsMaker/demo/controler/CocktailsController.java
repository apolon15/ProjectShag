package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.models.Alcohole;
import com.example.cocktailsMaker.demo.models.Syrups;
import com.example.cocktailsMaker.demo.models.Zapivon;
import com.example.cocktailsMaker.demo.repository.AlcoholeRepository;
import com.example.cocktailsMaker.demo.repository.SyrupsRepository;
import com.example.cocktailsMaker.demo.repository.ZapivonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class CocktailsController {
    @Autowired
    private SyrupsRepository syrupsRepository;
    @Autowired
    private AlcoholeRepository alcoholeRepository;
    @Autowired
    private ZapivonRepository zapivonRepository;

    /* метод при переходе на страницу index подгружает из таблицы все напитки и алко*/
    @GetMapping("/index")
    public String showSyrups(Model model) {
        List<Syrups> listSyrups = syrupsRepository.findAll();
        List<Alcohole> listAlco = alcoholeRepository.findAll();
        List<Zapivon> listZapivon = zapivonRepository.findAll();
        model.addAttribute("listSyr", listSyrups);
        model.addAttribute("listAlco", listAlco);
        model.addAttribute("listZapivon", listZapivon);
        return "index";
    }
}
