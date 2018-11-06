package com.ochabmateusz.cres.cresregisterusermicr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ochabmateusz.cres.cresregisterusermicr.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
