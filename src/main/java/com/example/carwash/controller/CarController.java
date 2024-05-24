package com.example.carwash.controller;

import com.example.carwash.dto.CarDTO;
import com.example.carwash.dto.OrderDTO;
import com.example.carwash.repository.CarRepository;
import com.example.carwash.service.CarService;
import com.example.carwash.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name="Машины", description="Взаимодействие с машинами")
@RestController
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping("/cars")
    public List<CarDTO> findAllCars() {
        return carService.findAll();
    }


    @PostMapping("/cars")
    CarDTO newCarDTO(@RequestBody CarDTO newCarDTO) {
        return carService.insert(newCarDTO);
    }

// Single item

    @GetMapping("/cars/{id}")
    CarDTO one(@PathVariable int id)  {
        return carService.containsById(id);

    }

    @PutMapping("/cars/{id}")
    CarDTO replaceCarDTO(@RequestBody CarDTO newCarDTO, @PathVariable int id) {
        return carService.update(newCarDTO);
    }

    @DeleteMapping("/cars/{id}")
    void deleteCarDTO(@PathVariable int id) {
        carService.delete(id);
    }
}

