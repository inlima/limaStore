package il.com.limastore.service;

import il.com.limastore.model.CustomerOrder;
import il.com.limastore.model.Product;

import java.util.List;

public interface CustomerOrderService
{
    void addCustomerOrder(CustomerOrder customerOrder);

    double getCustomerOrderGrandTotal(int cartId);

}
