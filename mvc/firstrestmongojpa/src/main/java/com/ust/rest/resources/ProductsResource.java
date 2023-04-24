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
import com.ust.rest.services.impl.ProductService;

@RestController
@RequestMapping("/product/api.3.0")
public class ProductsResource {
	
	@Autowired
	ProductService service;
	
	@GetMapping
	@RequestMapping("/retrieve/{productId}")
	public ResponseEntity<Products> fetchProduct(@PathVariable String productId ) {
		
		return ResponseEntity.ok(service.getProduct(productId));
	}
	
	@GetMapping
	@RequestMapping("/retrieve/all")
	public ResponseEntity<List<Products>> fectchProducts(){
		
		List<Products> list = service.getProducts();
		return ResponseEntity.ok(list);
		
	}
	
	@PostMapping
	@RequestMapping(value="/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Products> addProduct(@RequestBody Products product){
		
		return new ResponseEntity<Products>(service.add(product), HttpStatus.ACCEPTED);
		
		
	}
	
	@PutMapping
	@RequestMapping(value="/update",  consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Products updateProduct(@RequestBody Products product) {
		
		return service.updateProduct(product);
	}
	
	@DeleteMapping
	@RequestMapping(value="/delete/{productId}")
	public void deleteProduct(@PathVariable String productId) {
		service.deleteProduct(productId);
	}
	
	

}