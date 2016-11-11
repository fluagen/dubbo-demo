package com.calis.ill.order.service.api;

import com.calis.ill.order.entity.User;

public interface UserService {

	public void register(String account, String username, String password);
	
	public User getUserByAccount(String account);
}
