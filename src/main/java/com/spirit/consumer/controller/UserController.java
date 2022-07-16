package com.spirit.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spirit.consumer.models.UserDetails;
import com.spirit.consumer.services.UserService;

@RestController
public class UserController {

	@Autowired
	UserService user;
	
	
	@GetMapping("/ping")
	public ResponseEntity<Object> serviceUp(){
		return new ResponseEntity<>("Application running...", HttpStatus.OK);
	}
	
	@GetMapping("/ping/{uid}")
	public ResponseEntity<Object> userData(@PathVariable("uid")int uid){
		
		
		List<UserDetails> l1 = user.getUserDetails();
		if(uid >= 1) {
			List<UserDetails> l2 = user.getUserDetailsByUid(uid);
			for(Object l3 : l2) {
				System.out.println(l3);
			}
		}
		return new ResponseEntity<>(l1, HttpStatus.OK);
	}
}
