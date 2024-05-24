package com.example.carwash.model;
import com.example.carwash.dto.OrderDTO;
import com.example.carwash.dto.UserDTO;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "cost")
    private int cost;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public static Order from(OrderDTO orderdto){
        return new Order(orderdto.getId(), orderdto.getCost(), orderdto.getDescription(), orderdto.getUser());
    }

}
