package com.user.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.user.app.model.User;

@Repository
public interface UserRepository extends MongoRepository<User,String> {

	 

}
