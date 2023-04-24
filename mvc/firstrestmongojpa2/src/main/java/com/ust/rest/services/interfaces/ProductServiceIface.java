package com.ust.rest.services.interfaces;

import java.util.List;

import com.ust.rest.resource.Products;

public interface ProductServiceIface {
	
	public Products add(Products product);
	public Products getProduct(String productId);
	public List<Products> getProducts();
	public Products updateProduct(Products product);
	public void deleteProduct(String productId);
	
	

}
