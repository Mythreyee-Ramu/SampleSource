package com.spirit.consumer.services;

import java.util.List;

import com.spirit.consumer.models.UserDetails;

public interface UserService {

	public List<UserDetails> getUserDetails(); 

	List<UserDetails> getUserDetailsByUid(int uid); 
	
	
}
