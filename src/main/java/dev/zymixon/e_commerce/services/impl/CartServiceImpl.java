package dev.zymixon.e_commerce.services.impl;

import dev.zymixon.e_commerce.exceptions.CartNotFoundException;
import dev.zymixon.e_commerce.models.entities.CartEntity;
import dev.zymixon.e_commerce.repositories.CartRepository;
import dev.zymixon.e_commerce.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartRepository cartRepository;

    @Override
    public CartEntity getCart(Long cartId) throws CartNotFoundException {
        Optional<CartEntity> cart = cartRepository.findById(cartId);

        if (cart.isPresent())
            return cart.get();
        else
            throw new CartNotFoundException();
    }

    @Override
    public List<CartEntity> getCarts() {
        return cartRepository.findAll();
    }

    @Override
    public CartEntity saveCart(CartEntity cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void deleteCart(Long cartId) {
        cartRepository.deleteById(cartId);
    }
}
