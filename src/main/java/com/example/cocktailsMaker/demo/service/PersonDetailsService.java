package com.example.cocktailsMaker.demo.service;

import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.repository.UserRepository;
import com.example.cocktailsMaker.demo.security.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public PersonDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findUserByName(name);
        if (!user.isPresent()) {
            throw new UsernameNotFoundException("Такого нет в базе");
        }
        return new PersonDetails(user.get());
    }
}

