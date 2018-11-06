package com.ochabmateusz.cres.cresregisterusermicr.controller;

import java.util.ArrayList;

import org.apache.catalina.startup.CredentialHandlerRuleSet;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ochabmateusz.cres.cresregisterusermicr.entity.User;
import com.ochabmateusz.cres.cresregisterusermicr.jsonParser.JsonToObj;
import com.ochabmateusz.cres.cresregisterusermicr.repository.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@RestController
@CrossOrigin
public class NewUserController {

	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	BCryptPasswordEncoder encoder;
	
	private Logger logger= LoggerFactory.getLogger(this.getClass());
	
	
//	@GetMapping("/new-user-reg/{id}")
//	public void registerUser(@PathVariable int id) {
//		
//		String link=String.format("B:\\TEMPORARY\\CRES\\" +id +"newuser.json");
//		
//		logger.info("link {}", link);
//		ArrayList<String> arrayList=new ArrayList<String>();
//		JsonToObj readUser=new JsonToObj(link);
//		arrayList=readUser.readJson();
//		//JSONObject us=readUser.readJson();
//		User user=new User(arrayList.get(0), 
//				arrayList.get(1), 
//				arrayList.get(2));
//		
//		
//		userRepository.save(user);
//		
//	}
	
	@PostMapping("/register")
	public void registerNewUser(@RequestBody UserTemp us) {
			//@PathVariable String name,
			//@PathVariable String password,
			//@PathVariable String email) {

		System.out.println(us.getName()+us.getPassword()+us.getEmail()+encoder.encode(us.getPassword())+"free");
		
		User usr=new User(us.getName(), us.getPassword(), us.getEmail(), encoder.encode(us.getPassword()), "free"); 
		
		
		userRepository.save(usr);
		
		
		
		
		
		
	}
//	@PostMapping("/user_test")
//	public void usertest() {
//		
//		JsonToObj readUser=new JsonToObj(link);
//		
//		User user=new User((String)readUser.readJson().get("name"), 
//				(String)readUser.readJson().get("nick"), 
//				(String)readUser.readJson().get("password"));
//		
//		
//		userRepository.save(user);
//		
//	}
	@Getter @Setter @AllArgsConstructor
	private static class UserTemp{
		
		private String name;
		private String email;
		private String password;
		
		}
	
	
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}
}

