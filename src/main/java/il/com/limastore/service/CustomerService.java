package il.com.limastore.service;

import il.com.limastore.model.Customer;

import java.util.List;

public interface CustomerService
{
    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    void editCustomer(Customer customer);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);

}
