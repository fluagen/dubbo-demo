package com.calis.ill.server.controller;

import java.util.Map;

import org.springframework.data.annotation.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calis.ill.order.service.api.UserService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/user")
public class UserController {

	@Reference
	UserService userService;

	ObjectMapper mapper = new ObjectMapper();

	@PostMapping("/add")
	public void add(@RequestBody String userInfo) throws Exception {

		Map<String, String> rst = mapper.readValue(userInfo, new TypeReference<Map<String, String>>() {
		});
		String account = rst.get("account");
		String username = rst.get("username");
		String password = rst.get("password");

		userService.register(account, username, password);
	};
}
