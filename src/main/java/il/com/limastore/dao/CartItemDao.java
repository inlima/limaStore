package il.com.limastore.dao;

import il.com.limastore.model.Cart;
import il.com.limastore.model.CartItem;
import il.com.limastore.model.CartItem;

public interface CartItemDao
{
    void addCartItem(CartItem cartItem);

    void saveCartItem(CartItem cartItem);

    void removeCartItem(CartItem cartItem);

    void removeSavedCartItem (CartItem cartItem);

    void removeAllCartItems(Cart cart);

    CartItem getCartItemByProductId (int productId);
}
