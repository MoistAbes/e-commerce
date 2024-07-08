package dev.zymixon.e_commerce.models.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "cart")
public class CartEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(
            name = "carts_items",
            joinColumns = {@JoinColumn(name = "cart_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "item_id", referencedColumnName = "id")}
    )
    private List<ItemEntity> items;

}
