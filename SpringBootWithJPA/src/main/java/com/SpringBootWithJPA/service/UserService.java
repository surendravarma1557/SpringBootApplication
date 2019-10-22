package com.SpringBootWithJPA.service;

import java.util.List;
import java.util.Optional;

import com.SpringBootWithJPA.model.User;

public interface UserService {
	
	public List<User> getAllUsers();
	public User create(User user);
	
	public User updateUser(User user);
	
	public Optional<User> findById(Integer userId);
	
	public void delete(User args0);

}
