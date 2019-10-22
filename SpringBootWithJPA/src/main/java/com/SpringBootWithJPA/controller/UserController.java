package com.SpringBootWithJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootWithJPA.model.User;
import com.SpringBootWithJPA.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/getAllUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST, headers="Accept=application/json")
	public User create(@RequestBody User user){
		return  userService.create(user);
	}
	
	@RequestMapping(value="/update", method = RequestMethod.POST, headers="Accept=application/json")
	public User update(@RequestBody User user){
		return  userService.updateUser(user);
	}
	
	@RequestMapping(value="/delete")
	public void delete(User args0){
		 userService.delete(args0);
	}
	
	
	
	
}
