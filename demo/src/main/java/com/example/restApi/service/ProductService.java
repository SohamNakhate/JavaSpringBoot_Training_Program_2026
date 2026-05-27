package com.example.restApi.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restApi.model.Product;
import com.example.restApi.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
    private ProductRepository repository;

    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    public List<Product> getProducts() {
        return repository.getAllProducts();
    }

    public Product getProductById(int id) {
        return repository.findById(id);
    }


    public Product updateProduct(Product product) {
       return repository.update(product);
    }
    
    public String deleteProduct(int id) {
    	repository.delete(id);
    	return "product removed !! " + id;
    }
}





