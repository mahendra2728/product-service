package com.pm.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private String product_id;
	private String product_name;
	private String product_desc;
	private int quantity;
	
	
}
