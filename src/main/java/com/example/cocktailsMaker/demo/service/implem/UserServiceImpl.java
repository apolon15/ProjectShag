package com.example.cocktailsMaker.demo.service.implem;

import com.example.cocktailsMaker.demo.dto.UserDto;
import com.example.cocktailsMaker.demo.mapper.UserMapper;
import com.example.cocktailsMaker.demo.models.User;
import com.example.cocktailsMaker.demo.repository.UserRepository;
import com.example.cocktailsMaker.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public int dtoToUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getName());
        user.setMail(userDto.getMail());
        user.setPassword(userDto.getPass());
//        saveUser(user);
//        userDto.setId(userRepository.findByMail(user.getMail()).getId());
        return userDto.getId();
    }

    @Transactional
    @Override
    public void registerUser(User user) {
        //шифрование пароля при регистрации
        String codePass = passwordEncoder.encode(user.getPassword());
        //заменяем старый пароль зашифрованным перед сохранением
        user.setPassword(codePass);
        userRepository.save(user);

    }

    @Override
    public User saveUser(UserDto user) {
        return userRepository.save(UserMapper.userFromUserDto(user));
    }

    @Override
    public UserDto getUserById(Integer id) {
        return UserMapper.userDtoFromUser(userRepository.findById(id).orElse(null));
    }
}
