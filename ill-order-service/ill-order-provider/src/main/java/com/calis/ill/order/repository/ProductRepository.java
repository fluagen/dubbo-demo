package com.calis.ill.order.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.calis.ill.order.entity.Product;


public interface ProductRepository extends CrudRepository<Product, Long>{

	public List<Product> findByTitleContaining(String title);
	
	public Product findByCode(String code);
}
