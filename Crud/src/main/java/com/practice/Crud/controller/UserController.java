package com.practice.Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Crud.entity.User;
import com.practice.Crud.service.UserService;

@RestController
@RequestMapping(value = "/home")
public class UserController {
	@Autowired 
	UserService userservice;
	@PostMapping(value="/adduser")
	public String addUser(@RequestBody User details)
	{
		return userservice.addUser(details);
		
		
	}
	
	

}
