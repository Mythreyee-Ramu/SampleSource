package com.spirit.consumer.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.spirit.consumer.models.UserDetails;

@Repository
public interface UserRepository extends CrudRepository<UserDetails, Integer> {

	public List<UserDetails> findAll();
	
	@JsonIgnoreProperties
	@Transactional
	@Query("from UserDetails u where u.uid >= 1")
	public List<UserDetails> getUserDetailsById(int uid);
	
	
}
