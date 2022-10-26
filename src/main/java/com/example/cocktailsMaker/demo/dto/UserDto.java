package com.example.cocktailsMaker.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    public Integer id;
    public String name;
    public String pass;
    public String mail;

    public UserDto(Integer id, String name, String pass, String mail) {
        this.id = id;
        this.name = name;
        this.pass = pass;
        this.mail = mail;
    }

    public UserDto() {
    }
}
