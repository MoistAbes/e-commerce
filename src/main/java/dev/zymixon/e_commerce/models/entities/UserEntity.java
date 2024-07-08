package dev.zymixon.e_commerce.models.entities;

import jakarta.persistence.*;

@Entity(name = "user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastName;

    private String email;

    private String password;

    @OneToOne
    @JoinColumn(name = "cart_id")
    private CartEntity cart;
}
