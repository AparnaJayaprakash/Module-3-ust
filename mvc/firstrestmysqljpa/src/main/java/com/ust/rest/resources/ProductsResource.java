package com.ust.rest.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rest.resource.Products;
import com.ust.rest.services.ProductService;

@RestController
@RequestMapping("/product/api.2.0")
public class ProductsResource {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	@RequestMapping("/retrieve/{productId}")
	public Products fetchProduct(@PathVariable long productId ) {
		
		return service.getProduct(productId);
	}
	
	@GetMapping
	@RequestMapping("/retrieve/all")
	public List<Products> fectchProducts(){
		
		return service.getProducts();
		
	}
	
	@PostMapping
	@RequestMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addProduct(@RequestBody Products product){
		boolean result = service.add(product);
		if(result) {
			return ResponseEntity.status(HttpStatus.CREATED).body(true);
		}
		else {
			return ResponseEntity.status(HttpStatus.CREATED).body(false);
		}
		
	}
	
	@PutMapping
	@RequestMapping(value="/update",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Products updateProduct(@RequestBody Products product) {
		
		return service.updateProduct(product);
	}
	
	@DeleteMapping
	@RequestMapping(value="/delete/{productId}")
	public void deleteProduct(@PathVariable long productId) {
		service.deleteProduct(productId);
	}
	
	

}

