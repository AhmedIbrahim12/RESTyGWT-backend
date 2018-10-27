package com.restyGWT.services.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	@Autowired
	private UserRepository userRepo;

	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	public User addUser(User user) {
		return userRepo.save(user);
	}

	public User findByName(String userName) {
		return userRepo.findByuserName(userName);
	}
}
