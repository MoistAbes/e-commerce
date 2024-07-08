package dev.zymixon.e_commerce.services;

import dev.zymixon.e_commerce.exceptions.CartNotFoundException;
import dev.zymixon.e_commerce.models.entities.CartEntity;
import java.util.List;

public interface CartService {

    CartEntity getCart(Long cartId) throws CartNotFoundException;

    List<CartEntity> getCarts();

    CartEntity saveCart(CartEntity cart);

    void deleteCart(Long cartId);
}


