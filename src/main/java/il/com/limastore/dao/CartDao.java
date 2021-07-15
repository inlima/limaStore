package il.com.limastore.dao;

import il.com.limastore.model.Cart;

import java.io.IOException;

public interface CartDao {
    Cart getCartById(int cartId);

    Cart validate(int cartId) throws IOException;

    //SavedItems validateSavedItems(int savedItemsId) throws IOException;

    void update(Cart cart);
}

