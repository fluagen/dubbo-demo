package com.calis.ill.order.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calis.ill.order.entity.Product;
import com.calis.ill.order.repository.ProductRepository;
import com.calis.ill.order.service.api.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository repo;

	public void add(Product product) {
		repo.save(product);
	}

	public List<Product> query(String title) {
		List<Product> rst = repo.findByTitleContaining(title);
		return rst;
	}

	public Product queryByCode(String code) {
		return repo.findByCode(code);
	}

}
