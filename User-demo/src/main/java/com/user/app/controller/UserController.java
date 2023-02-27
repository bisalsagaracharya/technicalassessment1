package com.user.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.user.app.dto.UserDto;
import com.user.app.entity.User;
import com.user.app.service.UserService;

@RestController
@RequestMapping("/userservice")
public class UserController {
   
@Autowired 
private UserService userService;
  
 @PostMapping("/signup")
 public ResponseEntity<String>registerUser(@RequestBody UserDto userDto){
	 userService.newRegisterUser(userDto);
	 return new ResponseEntity<String>("User Signup successfuly",HttpStatus.OK);
 }
 
 /* @GetMapping("/{getusername}")
 public ResponseEntity<User>getUserByUserName(@PathVariable("getusername") String userName){
	 userService.getUserByUserName(userName);
	 return new ResponseEntity<User> (HttpStatus.OK);
	  
	 
 }*/
 
 
 
 
 @PutMapping("/{updateusername}")
 public ResponseEntity<String>updatUser(@PathVariable ("updateusername") String userName,UserDto userDto){
	 userService.updateUser(userName, userDto);
	 return new ResponseEntity<String>("User Update successfuly",HttpStatus.OK);
 
 }

 @DeleteMapping("/{deleteusername}")
 public ResponseEntity<String>deleteUserByUserName(@PathVariable ("deleteusername") String userName){
	 userService.deleteUserByUserName(userName);
	 return new ResponseEntity<String>("User delete successfuly",HttpStatus.OK);
 }
 
 @GetMapping("user/{id}")
	public User getUserByUserName(@PathVariable("id") String userName) {
	return this.userService.getUserByUserName(userName);	
	}
	
	/*@GetMapping("/")
	public String getGreeting() {
		return "Cart application.";
	}
	
	@PostMapping("user")
	public String addNewUser(@RequestBody User user) {
	 this.userService.addNewUser(user);
	 return "save";
	}
	
	@GetMapping("user/{id}")
	public User getUserById(@PathVariable("id") String userId) {
	return this.userService.getUserById(userId);	
	}
	
	@PutMapping("user")
	public User updateUser(@RequestBody User user) {
	return this.userService.updatUser(user);	
	}
	@DeleteMapping("user/{id}")
	public User deleteUserById(@PathVariable("id") String userId) {
	return this.userService.deleteUserById(userId);	
	}
	
	@GetMapping("users")
	public List<User>getAllUser() {
		return this.userService.getAllUser();
	}*/


 














}
