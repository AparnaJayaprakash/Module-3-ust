package com.ust.rest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ust.rest.repository.ProductRepository;
import com.ust.rest.resource.Products;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository repository;
	
	public Products getProduct(long productId) {
		
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
	@Transactional
	public boolean add(Products product) {
		if(validate(product)) {
			return false;            // cannot create duplicate product
		}else {
			repository.save(product);
			return true;
		}
		
		
	}
	
	public boolean validate(Products product) {
		if(product.getName().equals("Television")) {
			return true;
		}else {
			return false;
		}
	}
	
	public Products updateProduct(Products product) {
		return repository.save(product);
	}
	
	
	public void deleteProduct(long productId) {
		 repository.deleteById(productId);
	}
	
	

}
