package com.example.restApi.repository;
import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.example.restApi.model.Product; 

@Repository
public class ProductRepository {
	private List<Product> list = new ArrayList<Product>(); 
	
	public void createProducts() {

		list = List.of(
				new Product(1, "product 1", 10, 1000),
				new Product(2, "product 2", 20, 2000),
				new Product(3, "product 3", 30, 3000)
				);
	}

	
	public List<Product> getAllProducts() {
		return list;
	}

	
	public Product findById(int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getProductId() == (id)) {
				return list.get(i);
			}
		}
		return null;
	}

	
	public List<Product> search(String name) {
		return list.stream().filter(x -> x.getProductName().startsWith(name)).collect(Collectors.toList());
	}

	

	public Product save(Product p) {
		Product product = new Product();
		product.setProductId(p.getProductId());
		product.setProductName(p.getProductName());
		product.setQuantity(p.getQuantity());
		product.setPrice(p.getPrice());

		list.add(product);
		return product;
	}

	

	public String delete(Integer id) {
		list.removeIf(x -> x.getProductId() == (id));
		return null;
	}
	
	
	  public Product update(Product product) {
	        int idx = 0;
	        int id = 0;
	        for (int i = 0; i < list.size(); i++) {
	            if (list.get(i).getProductId() == (product.getProductId())) {
	                id = product.getProductId();
	                idx = i;
	                break;
	            }
	        }
	        
	        Product product1 = new Product();
	        product1.setProductId(id);
	        product1.setProductName(product.getProductName());
	        product1.setQuantity(product.getQuantity());
	        product1.setPrice(product.getPrice());
	        list.set(idx, product);
	        return product1;
	}
}



	

	
	
