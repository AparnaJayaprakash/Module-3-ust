package com.ust.rest.resource;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Products {
	
	@Id
	private String _id;
	private String name;
	private String description;
	private BigDecimal price;
	private int qty;
	
	
	

}
