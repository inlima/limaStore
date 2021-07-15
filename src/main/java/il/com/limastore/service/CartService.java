package il.com.limastore.service;

import il.com.limastore.model.Cart;

public interface CartService {
    Cart getCartById(int cartId);

    void update(Cart cart);
}


