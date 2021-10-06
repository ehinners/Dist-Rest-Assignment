package edu.wctc.wholesale.service;



import edu.wctc.wholesale.entity.Product;

import java.util.List;

public interface ProductService
{
    public Product getProduct(int productId);

    public List<Product> getProductList();
}
