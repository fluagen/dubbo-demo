package com.calis.ill.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.calis.ill.order.entity.Order;


public interface OrderRepository extends CrudRepository<Order, Long>{

}
