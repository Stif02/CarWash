package com.example.carwash.controller;

import com.example.carwash.dto.OrderDTO;
import com.example.carwash.dto.UserDTO;
import com.example.carwash.repository.OrderRepository;
import com.example.carwash.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Tag(name="Заказы", description="Взаимодействие с заказами")
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public List<OrderDTO> findAllOrders() {
        return orderService.findAll();
    }


    @PostMapping("/orders")
    OrderDTO newOrderDTO(@RequestBody OrderDTO newOrderDTO) {
        return orderService.insert(newOrderDTO);
    }

// Single item

    @GetMapping("/orders/{id}")
    OrderDTO one(@PathVariable int id)  {
        return orderService.containsById(id);

    }

    @PutMapping("/orders/{id}")
    OrderDTO replaceOrderDTO(@RequestBody OrderDTO newOrderDTO, @PathVariable int id) {
        return orderService.update(newOrderDTO);
    }

    @DeleteMapping("/orders/{id}")
    void deleteOrderDTO(@PathVariable int id) {
        orderService.delete(id);
    }
}


