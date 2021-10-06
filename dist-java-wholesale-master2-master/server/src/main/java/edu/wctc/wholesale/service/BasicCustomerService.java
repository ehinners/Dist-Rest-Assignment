package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasicCustomerService implements CustomerService
{
    private CustomerRepository customerRepository;

    @Autowired
    public BasicCustomerService(CustomerRepository cr)
    {
        customerRepository = cr;
    }

    @Override
    public Customer getCustomer(int customerId)
    {
        Optional<Customer> c = customerRepository.findById(customerId);
        if(c.isPresent())
        {
            return c.get();
        }

        return null;
    }

    @Override
    public List<Customer> getCustomerList()
    {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().forEach(list::add);
        return list;
    }
}
