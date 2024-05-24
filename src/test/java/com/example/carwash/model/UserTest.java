package com.example.carwash.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

        @Test
        public void userTest(){
            User user = new User(1,"Ivan","Roflanov","925");
            assertAll("Тест модели User",
                    () -> assertEquals(1, user.getId()),
                    () -> assertEquals("Ivan", user.getName()),
                    () -> assertEquals("Roflanov", user.getSurname()),
                    () -> assertEquals("925", user.getPhonenumber())
            );
    }

}
