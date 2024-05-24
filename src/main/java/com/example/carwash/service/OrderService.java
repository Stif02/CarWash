package com.example.carwash.service;

import com.example.carwash.dto.OrderDTO;

import java.util.List;

public interface OrderService  {
    OrderDTO insert(OrderDTO dto);
    OrderDTO update(OrderDTO dto);
    int delete(int id);
    OrderDTO containsById(int id);
    List<OrderDTO> findAll();
}