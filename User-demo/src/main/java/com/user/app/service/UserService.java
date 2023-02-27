package com.user.app.service;

import com.user.app.dto.UserDto;
import com.user.app.entity.User;

public interface UserService {
	
	/*User addNewUser(User user);
	User getUserById(String id);
	User updatUser(User user);
	User deleteUserById(String id);
	List<User> getAllUser();*/
	
	void newRegisterUser(UserDto userDto) ;
	//UserDto getUserByUserName(String userNmae );
	UserDto updateUser(String userNmae, UserDto userDto);
	void deleteUserByUserName(String userName);
	
	User getUserByUserName(String id);

}
