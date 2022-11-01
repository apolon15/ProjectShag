package com.example.cocktailsMaker.demo.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    public Integer id;
    public String name;
    public String pass;
    public String mail;
}
