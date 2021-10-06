package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;

import java.util.List;

public interface CustomerService
{
    public Customer getCustomer(int customerId);

    public List<Customer> getCustomerList();
}
