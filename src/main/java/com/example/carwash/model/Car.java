package com.example.carwash.model;
import com.example.carwash.dto.CarDTO;
import com.example.carwash.dto.OrderDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "model", unique = false, nullable = false)
    private String model;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public static Car from(CarDTO cardto){
        return new Car(cardto.getId(), cardto.getModel(),cardto.getUser());
    }
}
