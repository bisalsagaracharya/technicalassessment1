package com.user.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

 
import com.user.app.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
        Boolean existsByUserName(String userName);
        Boolean existsByEmail(String email);
        User findByUserName(String userName);
	
}
