package com.example.carwash.model;

import com.example.carwash.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "phonenumber", unique = true, nullable = false)
    private String phonenumber;

    public static User from(UserDTO userdto){
        return new User(userdto.getId(),userdto.getName(), userdto.getSurname(), userdto.getPhonenumber());
    }

}
