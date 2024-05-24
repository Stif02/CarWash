package com.example.carwash.controller;

import com.example.carwash.dto.UserDTO;
import com.example.carwash.dto.UserDiscountDTO;
import com.example.carwash.service.UserDiscountService;
import com.example.carwash.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@Tag(name="Взаимодействие микросервисов", description="Получение пользователя и сообщения с заглушки")
@RestController
public class UserDiscountController {
    @Autowired
    UserDiscountService userDiscountService;
    @GetMapping("/userdiscount/{id}")
    UserDiscountDTO one(@PathVariable int id)  {
        return userDiscountService.containsById(id);
    }
}
