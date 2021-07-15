package il.com.limastore.service.impl;

import il.com.limastore.dao.CustomerOrderDao;
import il.com.limastore.model.Cart;
import il.com.limastore.model.CartItem;
import il.com.limastore.model.CustomerOrder;
import il.com.limastore.model.Product;
import il.com.limastore.service.CartService;
import il.com.limastore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService
{
    @Autowired
    private CustomerOrderDao customerOrderDao;

    @Autowired
    private CartService cartService;

    @Autowired
    private List<Product> bestSellers;

    public void addCustomerOrder(CustomerOrder customerOrder) {
        customerOrderDao.addCustomerOrder(customerOrder);
    }

    public double getCustomerOrderGrandTotal(int cartId) {
        double grandTotal=0;
        Cart cart = cartService.getCartById(cartId);
        List<CartItem> cartItems = cart.getCartItems();

        for (CartItem item : cartItems) {
            grandTotal+=item.getTotalPrice();
        }

        return grandTotal;
    }


}
