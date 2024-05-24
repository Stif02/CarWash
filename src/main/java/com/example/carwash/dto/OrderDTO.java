package com.example.carwash.dto;

import com.example.carwash.model.Order;
import com.example.carwash.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private int id;
    private int cost;
    private String description;
    private User user;
    public static OrderDTO from(Order order){
        return new OrderDTO(order.getId(), order.getCost(), order.getDescription(), order.getUser());
    }
}
