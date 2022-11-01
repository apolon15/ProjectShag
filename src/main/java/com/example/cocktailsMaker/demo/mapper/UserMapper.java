package com.example.cocktailsMaker.demo.mapper;

import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.models.User;
import org.springframework.stereotype.Component;

import java.util.Objects;


@Component
public class UserMapper {

    public static UserDto userDtoFromUser(User user){
        return Objects.nonNull(user) ?
                UserDto.builder()
                        .id(user.getId())
                        .mail(user.getMail())
                        .name(user.getName())
                        .pass(user.getPass())
                        .build() : null;
    }

    public static  User userFromUserDto(UserDto userDto){
        return Objects.nonNull(userDto) ?
                User.builder()
                        .id(userDto.getId())
                        .mail(userDto.getMail())
                        .name(userDto.getName())
                        .pass(userDto.getPass())
                        .build() : null;
    }

}
