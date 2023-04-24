package com.ust.rest.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Products;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Products getProduct(long productId) {
		
		return repository.getProduct(productId);
	}

	public ArrayList<Products> getProducts() {
		
		return repository.getProducts();
		
		
	}
	
	public boolean add(Products product) {
		
		return repository.addProduct(product);
	}
	
	public Products updateProduct(Products product) {
		return repository.updateProduct(product);
	}
	
	public void deleteProduct(long productId) {
		 repository.delete(productId);
	}
	
	

}
