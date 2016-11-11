package com.calis.ill.order.service.impl;

import java.util.List;

import com.calis.ill.order.entity.Order;
import com.calis.ill.order.entity.OrderItem;
import com.calis.ill.order.entity.User;
import com.calis.ill.order.service.api.OrderService;

public class OrderServiceImpl implements OrderService{

	public void create(List<OrderItem> orderItems, User user) {
		Order order = new Order();
		order.setSn("xxx-111-1234567");
		order.setUser(user);
		order.setOrderItems(orderItems);
		
		
		
		
	}

}
