package com.example.carwash.service;

import com.example.carwash.dto.UserDiscountDTO;
import com.example.carwash.model.User;
import com.example.carwash.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.Optional;
@Service
public class UserDiscountServiceImpl implements UserDiscountService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDiscountDTO containsById(int id) {
        Optional<User> user=userRepository.findById(id);

        String answer=getDiscount();
        UserDiscountDTO userDiscountDTO=new UserDiscountDTO(user.get().getId(),user.get().getName(),user.get().getSurname(),user.get().getPhonenumber(),answer);
        return userDiscountDTO;
    }
    public static String getDiscount(){
        RestClient defaultClient = RestClient.create();
        String result = defaultClient.get()
                .uri("http://localhost:8081/logs")
                .retrieve()
                .body(String.class);
        return result;
    }
}
