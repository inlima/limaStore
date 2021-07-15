package il.com.limastore.service.impl;

import il.com.limastore.dao.CartDao;
import il.com.limastore.model.Cart;
import il.com.limastore.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService
{
    @Autowired
    private CartDao cartDao;

    public void update(Cart cart) {
        cartDao.update(cart);
    }

    public Cart getCartById(int cartId) {
        return cartDao.getCartById(cartId);
    }

}