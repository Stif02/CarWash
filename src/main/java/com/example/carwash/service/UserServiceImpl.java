package com.example.carwash.service;

import com.example.carwash.dto.UserDTO;
import com.example.carwash.model.User;
import com.example.carwash.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO insert(UserDTO dto) {
        User user =User.from(dto);
        userRepository.save(user);
        return dto;
    }

    @Override
    public UserDTO update(UserDTO dto) {
        User user =User.from(dto);
        userRepository.save(user);
        return dto;
    }

    @Override
    public int delete(int id) {
        userRepository.deleteById(id);
        return id;
    }

    @Override
    public UserDTO containsById(int id) {
        Optional<User> user=userRepository.findById(id);
        UserDTO userdto=UserDTO.from(user.get());
        return userdto;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User>userList =userRepository.findAll();
        List<UserDTO> dtos = userList
                .stream()
                .map(UserDTO::from)
                .collect(Collectors.toList());
        return dtos;
    }
}
