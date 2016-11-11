package com.calis.ill.order.service.api;

import java.util.List;

import com.calis.ill.order.entity.OrderItem;
import com.calis.ill.order.entity.User;

public interface OrderService {

	public void create(List<OrderItem> orderItems, User user);
}
