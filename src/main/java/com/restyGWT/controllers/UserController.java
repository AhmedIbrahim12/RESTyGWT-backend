package com.restyGWT.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restyGWT.services.users.User;
import com.restyGWT.services.users.UsersService;

@RestController
@CrossOrigin
public class UserController {

	@Autowired
	UsersService service;

	@RequestMapping(path = "/fetchAllUsers", method = RequestMethod.GET)
	public List<User> getAllUsers() {
		return service.getAllUsers();
	}

	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public User addUser(@RequestParam("username") String userName) {
		return service.addUser(new User(userName));
	}
}
