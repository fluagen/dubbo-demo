package com.calis.ill.order.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calis.ill.order.entity.User;
import com.calis.ill.order.repository.UserRepository;
import com.calis.ill.order.service.api.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepo;

	public void register(String account, String username, String password) {
		User u = new User();
		u.setAccount(account);
		u.setUsername(username);
		u.setPassword(password);
		
		userRepo.save(u);
	}

	public User getUserByAccount(String account) {
		User u = userRepo.findByAccount(account);
		return u;
	}

}
