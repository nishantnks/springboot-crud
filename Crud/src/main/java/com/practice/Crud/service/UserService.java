package com.practice.Crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.Crud.entity.User;
import com.practice.Crud.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository repository;
	public String addUser(User details) {
		repository.save(details);
		return "saved successfully";
	}

}
