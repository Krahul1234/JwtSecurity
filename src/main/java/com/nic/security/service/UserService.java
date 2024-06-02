package com.nic.security.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nic.security.dto.User;
import com.nic.security.userrepo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	public List<User> getUser(){
		return userRepo.findAll();
	}
	
	

}
