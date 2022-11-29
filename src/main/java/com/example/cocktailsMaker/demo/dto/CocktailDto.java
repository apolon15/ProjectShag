package com.example.cocktailsMaker.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CocktailDto {
    public String strongDrink;
    public String lightDrink;
    public String midleDrink;
}
