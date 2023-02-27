package com.user.app.controller;
 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.app.model.User;
import com.user.app.repository.UserRepository;
 

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;

	//@GetMapping("/")
	//public String greet() {
	//	return "Mongo Repository Demo";
	//}
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) {
		return  this.userRepo.save(user);
	 
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable ("id") String id) {
		Optional<User> findById = this.userRepo.findById(id);
	   return findById.get();
	}
	
	 
	
}
