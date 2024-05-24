package com.example.carwash.service;

import com.example.carwash.dto.CarDTO;

import java.util.List;

public interface CarService {
    CarDTO insert(CarDTO dto);
    CarDTO update(CarDTO dto);
    int delete(int id);
    CarDTO containsById(int id);
    List<CarDTO> findAll();
}