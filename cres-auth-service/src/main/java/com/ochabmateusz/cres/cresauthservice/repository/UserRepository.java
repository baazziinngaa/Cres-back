package com.ochabmateusz.cres.cresauthservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ochabmateusz.cres.cresauthservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

	

}
