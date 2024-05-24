package com.example.carwash.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    public void orderTest(){
        User user=new User(1,"Ivan","Roflanov","925");
        Order order=new Order(1,1200,"Полная мойка",user);
        assertAll("Тест модели Order",
                () -> assertEquals(1, order.getId()),
                () -> assertEquals(1200, order.getCost()),
                () -> assertEquals("Полная мойка", order.getDescription()),
                () -> assertEquals(user, order.getUser())
        );
    }
}