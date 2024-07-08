package dev.zymixon.e_commerce.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "item")
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "items")
    private List<CartEntity> carts;

}
