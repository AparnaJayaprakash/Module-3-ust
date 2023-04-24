package com.ust.rest.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Products;
import com.ust.rest.services.interfaces.ProductServiceIface;

@Service
public class ProductService implements ProductServiceIface{
	
	@Autowired
	ProductRepository repository;
	
	public Products getProduct(String productId) {
		
		Optional<Products> optional = repository.findById(productId);
		if(optional.isPresent()) {
			return optional.get();
		}
		else {
			return null;
		}
		
	}

	public List<Products> getProducts() {
		
		return repository.findAll();
		
		
	}
	
	public Products add(Products product) {
		
		return repository.save(product);
		
	}
	
	public Products updateProduct(Products product) {
		return repository.save(product);
	}
	
	
	public void deleteProduct(String productId) {
		 repository.deleteById(productId);
	}
	
	

}
