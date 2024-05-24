package com.example.carwash.service;

import com.example.carwash.dto.OrderDTO;
import com.example.carwash.dto.UserDTO;
import com.example.carwash.model.Order;
import com.example.carwash.model.User;
import com.example.carwash.repository.OrderRepository;
import com.example.carwash.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;
    @Override
    public OrderDTO insert(OrderDTO dto) {
        Order order= Order.from(dto);
        orderRepository.save(order);
        return dto;
    }

    @Override
    public OrderDTO update(OrderDTO dto) {
        Order order= Order.from(dto);
        orderRepository.save(order);
        return dto;
    }

    @Override
    public int delete(int id) {
        orderRepository.deleteById(id);
        return id;
    }

    @Override
    public OrderDTO containsById(int id) {
        Optional<Order> order=orderRepository.findById(id);
        OrderDTO orderdto=OrderDTO.from(order.get());
        return orderdto;
    }

    @Override
    public List<OrderDTO> findAll() {
        List<Order>orderList =orderRepository.findAll();
        List<OrderDTO> dtos = orderList
                .stream()
                .map(OrderDTO::from)
                .collect(Collectors.toList());
        return dtos;
    }
}
