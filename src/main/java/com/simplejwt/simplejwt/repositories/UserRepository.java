package com.simplejwt.simplejwt.repositories;

import com.simplejwt.simplejwt.domain.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
}
