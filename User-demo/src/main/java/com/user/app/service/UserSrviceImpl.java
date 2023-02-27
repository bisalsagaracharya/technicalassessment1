package com.user.app.service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.user.app.dto.UserDto;
import com.user.app.entity.User;
import com.user.app.exception.EmailAlreadyExistsException;
import com.user.app.exception.UserNameAlreadyExistsException;
import com.user.app.exception.UserNameNotExistException;
import com.user.app.repository.UserRepository;

@Service
public class UserSrviceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void newRegisterUser(UserDto userDto)  {
		 if(userRepository.existsByEmail(userDto.getEmail())) {
			 throw new EmailAlreadyExistsException("email"+userDto.getEmail());
			 
		 }
		if(userRepository.existsByUserName(userDto.getUserName())) {
			throw new UserNameAlreadyExistsException("userName"+userDto.getUserName());
		}
		
		User user=new User();
		user.setUserId(userDto.getUserId());
		user.setUserName(userDto.getUserName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setConfirmPassword(userDto.getConfirmPassword());
		user.setMobileNo(userDto.getMobileNo());
		user.setRole(userDto.getRole());
		userRepository.save(user); 
	}

	/*@Override
	public UserDto getUserByUserName(String userName) {
		    User user = userRepository.findByUserName(userName);
		    
		    if(user==null) {
			  throw new UserNameNotExistException("User not found username:"+userName);
			    
		  }
		  return EntityToDto(user);
	}*/

	@Override
	public void deleteUserByUserName(String userName) {
		 User user = userRepository.findByUserName(userName);
		 
		 if(user==null) {
			 
			  throw new UserNameNotExistException("User not found username:"+userName);

		 }
		userRepository.delete(user);
	 
	}

	@Override
	public UserDto updateUser(String userName, UserDto userDto) {
             User user = userRepository.findByUserName(userName);
             if(user==null) {
   			  throw new UserNameNotExistException("User not found username:"+userName);
   			   
   		  }
           
     		user.setUserId(userDto.getUserId());
     		user.setUserName(userDto.getUserName());
     		user.setEmail(userDto.getEmail());
     		user.setPassword(userDto.getPassword());
     		user.setConfirmPassword(userDto.getConfirmPassword());
     		user.setMobileNo(userDto.getMobileNo());
     		user.setRole(userDto.getRole());
     		User user1 = userRepository.save(user); 
     	    
     		return EntityToDto(user1);
	}
	
	// convert entity to dto.     
    
	public UserDto EntityToDto(User user) {
		UserDto userDto=new ModelMapper().map(user,UserDto.class);
		return userDto; 
	}
	
	// convert dto to entity.
	
	public User DtoToEntity(UserDto uesrDto) {
		User user=new ModelMapper().map(uesrDto,User.class);
		return user;
	}
	
	@Override
	public User getUserByUserName(String id) {
		
		return this.userRepository.findByUserName(id);
	}
	
	
	
}
	/*@Override
	public User addNewUser(User user) {
		return this.userRepo.save(user);
	}

	@Override
	public User getUserById(String id) {
		
		return this.userRepo.findById(id).get();
	}

	@Override
	public User updatUser(User user) {
		
		return this.userRepo.save(user);
	}

	@Override
	public User deleteUserById(String id) {
		Optional<User> OptProduct = this.userRepo.findById(id);
		if(OptProduct.isEmpty())
		{
			
		}
		return OptProduct.get();
	}

	@Override
	public List<User> getAllUser() {
		return this.userRepo.findAll();
	}*/



