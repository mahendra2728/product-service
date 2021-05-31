package com.pm.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pm.demo.model.Product;

@RestController
@RequestMapping("/v1/api/")
public class ProductController {

	
	List<Product> products=Arrays.asList(new Product(UUID.randomUUID().toString(),"Mobiles","Telecommunication",10),
										 new Product(UUID.randomUUID().toString(),"Laptop","Electronis",2),
										 new Product(UUID.randomUUID().toString(),"Furniture","Home Decorator",5),
										 new Product(UUID.randomUUID().toString(),"Cloths","Life Style",15),
										 new Product(UUID.randomUUID().toString(),"Shoes","Footware",10));
	@GetMapping("test")
	public String index() {
		return "This is Demo example using AWS Code Pipeline";
	}
	
	@GetMapping("products")
	public ResponseEntity<List<Product>> getProductList(){
		System.out.println("test");
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
}
