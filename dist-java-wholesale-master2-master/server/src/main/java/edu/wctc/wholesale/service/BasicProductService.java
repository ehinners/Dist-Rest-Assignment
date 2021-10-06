package edu.wctc.wholesale.service;

import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.entity.Product;
import edu.wctc.wholesale.repo.CustomerRepository;
import edu.wctc.wholesale.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BasicProductService implements ProductService
{

    private ProductRepository productRepository;

    @Autowired
    public BasicProductService(ProductRepository pr)
    {
        productRepository = pr;
    }

    @Override
    public Product getProduct(int productId)
    {
        Optional<Product> p = productRepository.findById(productId);
        if(p.isPresent())
        {
            return p.get();
        }

        return null;
    }

    @Override
    public List<Product> getProductList()
    {
        List<Product> list = new ArrayList<>();
        productRepository.findAll().forEach(list::add);
        return list;
    }
}
