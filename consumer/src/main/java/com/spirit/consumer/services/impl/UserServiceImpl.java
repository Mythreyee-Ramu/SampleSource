package com.spirit.consumer.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spirit.consumer.models.UserDetails;
import com.spirit.consumer.repository.UserRepository;
import com.spirit.consumer.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;
	
	@Override
	public List<UserDetails> getUserDetails() {
		
		return repo.findAll() ;
	}

	@Override
	public List<UserDetails> getUserDetailsByUid(int uid) {
		
		return repo.getUserDetailsById(uid);
	}

	
}
