package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserService {
	
	@Autowired
	private PasswordEncoder paszak;
	 
	@Autowired
	private UsersRepository repository;
	
	public void registerNewUserAccount(Users accountDto) {
	    Users u1 = new Users();
	    u1.setPassword(paszak.encode(accountDto.getPassword()));
	    u1.setEmail(accountDto.getEmail());
	    u1.setRole(Integer.valueOf(1));
	    u1.setName(accountDto.getName());
	    u1.setLastName(accountDto.getLastName());

	    repository.save(u1);
	}
}
