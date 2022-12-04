package com.example.cocktailsMaker.demo.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CocktailDto {
//    public String strongDrink;
//    public String lightDrink;
//    public String midleDrink;


    private String userName;
    private List<String> strongDrinks;
    private List<String> lightDrinks;
    private List<String> midleDrinks;
}
