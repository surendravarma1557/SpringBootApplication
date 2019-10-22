package com.SpringBootWithJPA.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootWithJPA.dao.UserRepository;
import com.SpringBootWithJPA.model.User;
@Service
public class UserServiceImplements implements UserService {
	
	@Autowired
	private UserRepository userRepository; 
	@Transactional
	@Override
	public List<User> getAllUsers() {
		
		return (List<User>) userRepository.findAll();
	}
	@Transactional
	@Override
	public User create(User user) {
		
		return userRepository.save(user);
	}
	@Transactional
	@Override
	public User updateUser(User user) {
		
		return userRepository.save(user);
	}
	@Transactional
	@Override
	public Optional<User> findById(Integer userId) {
		
		return userRepository.findById(userId);
	}
	@Transactional
	@Override
	public void delete(User args0) {
		
		 userRepository.delete(args0);
		
		
	}
	

}
