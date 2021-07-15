package il.com.limastore.service.impl;

import il.com.limastore.dao.CustomerDao;
import il.com.limastore.model.Customer;
import il.com.limastore.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerDao customerDao;

    public void addCustomer(Customer customer) {
        customerDao.addCustomer(customer);
    }

    public Customer getCustomerById(int customerId) {
        return customerDao.getCustomerById(customerId);
    }

    public List<Customer> getAllCustomers() {
        return customerDao.getAllCustomers();
    }

    public Customer getCustomerByUsername(String username)
    {
        return customerDao.getCustomerByUsername(username);
    }

    public void editCustomer(Customer customer)
    {
        customerDao.editCustomer(customer);
    }

}
