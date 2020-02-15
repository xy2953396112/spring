package com.spring.test.tests.service;

import com.spring.test.tests.model.Product;
import java.util.Collection;

public interface ProductService {

    public abstract void createProduct(Product product);

    public abstract void updateProduct(String id, Product product);

    public abstract void deleteProduct(String id);

    public abstract Collection<Product> getProducts();
}
