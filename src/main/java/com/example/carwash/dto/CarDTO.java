package com.example.carwash.dto;

import com.example.carwash.model.Car;
import com.example.carwash.model.User;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {
    private int id;
    private String model;
    private User user;
    public static CarDTO from(Car car){
        return new CarDTO(car.getId(), car.getModel(),car.getUser());
    }
}
