package com.example.carwash.service;

import com.example.carwash.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO insert(UserDTO dto);
    UserDTO update(UserDTO dto);
    int delete(int id);
    UserDTO containsById(int id);
    List<UserDTO> findAll();
}

