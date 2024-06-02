package com.nic.security.service;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class JwtRequest {

	private String Email;
	private String Password;

	public JwtRequest(String email, String password) {
		super();
		Email = email;
		Password = password;
	}

}
