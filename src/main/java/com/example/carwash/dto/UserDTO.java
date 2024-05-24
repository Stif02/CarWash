package com.example.carwash.dto;

import com.example.carwash.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private int id;
    private String name;
    private String surname;
    private String phonenumber;

    public static UserDTO from(User user){
        return new UserDTO(user.getId(),user.getName(),user.getSurname(),user.getPhonenumber());
    }
}
