package com.example.cocktailsMaker.demo.controler;

import com.example.cocktailsMaker.demo.repository.AlcoholeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AlcoController {
    @Autowired
    private AlcoholeRepository alcoholeRepository;

}
