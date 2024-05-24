package com.example.carwash.service;

import com.example.carwash.dto.CarDTO;
import com.example.carwash.dto.OrderDTO;
import com.example.carwash.dto.UserDTO;
import com.example.carwash.model.Car;
import com.example.carwash.model.User;
import com.example.carwash.repository.CarRepository;
import com.example.carwash.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements  CarService{
    @Autowired
    private CarRepository carRepository;

    @Override
    public CarDTO insert(CarDTO dto) {
        Car car =Car.from(dto);
        carRepository.save(car);
        return dto;
    }

    @Override
    public CarDTO update(CarDTO dto) {
        Car car =Car.from(dto);
        carRepository.save(car);
        return dto;
    }

    @Override
    public int delete(int id) {
        carRepository.deleteById(id);
        return id;
    }

    @Override
    public CarDTO containsById(int id) {
        Optional<Car> car=carRepository.findById(id);
        CarDTO cardto=CarDTO.from(car.get());
        return cardto;
    }

    @Override
    public List<CarDTO> findAll() {
        List<Car>carList =carRepository.findAll();
        List<CarDTO> dtos = carList
                .stream()
                .map(CarDTO::from)
                .collect(Collectors.toList());
        return dtos;
    }
}
