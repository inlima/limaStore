package il.com.limastore.controller;

import il.com.limastore.model.Cart;
import il.com.limastore.model.CartItem;
import il.com.limastore.model.Customer;
import il.com.limastore.model.CustomerOrder;
import il.com.limastore.service.CartService;
import il.com.limastore.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

// This controller is in charge of handling any events that control the customers orders
@Controller
public class OrderController
{
    // cartService accesses the database of carts
    @Autowired
    private CartService cartService;

    // customerOrderService accesses the database of customers orders
    @Autowired
    private CustomerOrderService customerOrderService;


    @RequestMapping("/order/{cartId}")
    public String createOrder(@PathVariable("cartId") int cartId) {
        CustomerOrder customerOrder = new CustomerOrder();
        Cart cart=cartService.getCartById(cartId);

        customerOrder.setCart(cart);

        Customer customer = cart.getCustomer();
        customerOrder.setCustomer(customer);
        customerOrder.setShippingAddress(customer.getShippingAddress());

        customerOrderService.addCustomerOrder(customerOrder);


        return "redirect:/checkout?cartId="+cartId;
    }
}
