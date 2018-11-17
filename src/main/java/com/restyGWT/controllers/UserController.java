package com.restyGWT.controllers;

import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restyGWT.dto.User;
import com.restyGWT.services.users.UserEntity;
import com.restyGWT.services.users.UsersService;

@RestController
@CrossOrigin
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	UsersService service;

	@Autowired
	DozerBeanMapper mapper;

	@RequestMapping(path = "/fetchAllUsers", method = RequestMethod.GET)
	public List<UserEntity> getAllUsers() {
		return service.getAllUsers();
	}

	@RequestMapping(path = "/addUser", method = RequestMethod.POST)
	public User addUser(@RequestParam("username") String userName) {
		UserEntity entity = service.addUser(new UserEntity(userName));
		return mapper.map(entity, User.class);
	}
}
