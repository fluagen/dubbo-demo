package com.calis.ill.order.service.api;

import java.util.List;

import com.calis.ill.order.entity.Product;

public interface ProductService {

	public void add(Product product);
	
	public List<Product> query(String title);
	
	public Product queryByCode(String code);
	
}
