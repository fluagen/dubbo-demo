package com.calis.ill.order.repository;

import org.springframework.data.repository.CrudRepository;

import com.calis.ill.order.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByAccount(String account);
}
