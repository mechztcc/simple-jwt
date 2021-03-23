package com.simplejwt.simplejwt.services;

import com.simplejwt.simplejwt.domain.User;
import com.simplejwt.simplejwt.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User findUser(Integer id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }
}



