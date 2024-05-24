package com.example.carwash.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    public void carTest(){
        User user=new User(1,"Ivan","Roflanov","925");
        Car car = new Car(1,"Porshe",user);
        assertAll("Тест модели Car",
                () -> assertEquals(1, car.getId()),
                () -> assertEquals("Porshe", car.getModel()),
                () -> assertEquals(user, car.getUser())
        );
    }
}
