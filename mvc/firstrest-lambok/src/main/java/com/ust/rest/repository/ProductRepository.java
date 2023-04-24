package com.ust.rest.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.stereotype.Repository;

import com.ust.rest.resource.Products;

@Repository
public class ProductRepository {
	
	private ArrayList<Products> productCache = new ArrayList<>();
	
	//C-Create
	public boolean addProduct(Products product) {
		if(productCache.add(product)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//R-Retrieve
	public Products getProduct(long productId) {
		
		Iterator<Products> iter = productCache.iterator();
		Products product =null;
		while(iter.hasNext()) 
		{
			product = iter.next();
			if(product.getProductId() == productId)
				return product;
		}
		if(product!=null )
			return product;
		else
			return null;
		
	}
	
	//U-Update
	public Products updateProduct(Products productToUpdate) {
		
		Products searchProduct = null;
		Iterator<Products> iter = productCache.iterator();
		int index=0;
		while(iter.hasNext()) {
			
			searchProduct = iter.next();
			if(searchProduct.getProductId() == productToUpdate.getProductId()) {
				productCache.add(index,productToUpdate);
				productToUpdate = searchProduct;
			}
			index++;
		}
		return productToUpdate;
		
	}
	
	
	//D-Delete
	public void delete(long productId) {
		Iterator<Products> iter = productCache.iterator();
		int index = 0;
		while(iter.hasNext()) {
			Products temProduct = iter.next();
			if(temProduct.getProductId() == productId) {
				//productCache.remove(index);
				break;
			}
			index++;
		}
		productCache.remove(index);
	}
	
	
	
	
	
	 public ProductRepository() {
		
		 Products p1 = new Products();
		 p1.setProductId(101);
		 p1.setName("Laptop");
		 p1.setDescription("Macbook Retina Eye");
		 p1.setPrice(new BigDecimal(180000));
		 p1.setQty(5);
		 productCache.add(p1);
		 
		 Products p2 = new Products();
		 p2.setProductId(102);
		 p2.setName("Tablet");
		 p2.setDescription("Samsung max view");
		 p2.setPrice(new BigDecimal(35000));
		 p2.setQty(10);
		 productCache.add(p2);
		 
		 Products p3 = new Products();
		 p3.setProductId(103);
		 p3.setName("Mobile");
		 p3.setDescription("IPhone 13");
		 p3.setPrice(new BigDecimal(680000));
		 p3.setQty(7);
		 productCache.add(p3);
		 
		 Products p4 = new Products();
		 p4.setProductId(104);
		 p4.setName("Television");
		 p4.setDescription("Sony Bravo 75\"");
		 p4.setPrice(new BigDecimal(750000));
		 p4.setQty(7);
		 productCache.add(p4);
		 
		 Products p5 = new Products();
		 p5.setProductId(105);
		 p5.setName("Air Conditioner");
		 p5.setDescription("Whirlpool 3D magic");
		 p5.setPrice(new BigDecimal(500000));
		 p5.setQty(15);
		 productCache.add(p5);
	}

	public ArrayList<Products> getProducts() {
		
		return productCache;
	}

}
