package com.nic.security.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nic.security.dto.User;
import com.nic.security.service.UserService;

@RestController
@RequestMapping("/home")
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("Getting Users");
		return userService.getUser();

	}

	@GetMapping("/getUsers")
	public String getLoggedIn(Principal principal) {
		return principal.getName();

	}

}
