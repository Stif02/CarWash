package com.example.carwash.controller;

import Exceptions.UserDTONotFoundException;
import com.example.carwash.dto.UserDTO;
import com.example.carwash.model.User;
import com.example.carwash.repository.UserRepository;
import com.example.carwash.service.UserService;
import com.example.carwash.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;
@Tag(name="Пользователь", description="Взаимодействие с пользователем")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserDTO> findAllUsers() {
        return userService.findAll();
    }


    @PostMapping("/users")
    UserDTO newUserDTO(@RequestBody UserDTO newUserDTO) {
        return userService.insert(newUserDTO);
    }

// Single item

    @GetMapping("/users/{id}")
    UserDTO one(@PathVariable int id)  {
        return userService.containsById(id);

    }

    @PutMapping("/users/{id}")
    UserDTO replaceUserDTO(@RequestBody UserDTO newUserDTO, @PathVariable int id) {
        return userService.update(newUserDTO);
    }

    @DeleteMapping("/users/{id}")
    void deleteUserDTO(@PathVariable int id) {
        userService.delete(id);
    }
}
