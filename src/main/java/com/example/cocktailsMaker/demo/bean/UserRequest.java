package com.example.cocktailsMaker.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserRequest {

    private String name;
    private Integer id;
    private String mail;
    private String pass;

}