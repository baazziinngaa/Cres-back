package com.ochabmateusz.cres.cresauthservice.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="userss")
@Getter @Setter
public class User {
	
	
	
	@Id
	private Long id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="password")
	private String password;
	
	@Column(name="hashedpassw")
	private String hashedpassw;

	@Column(name="email")
	private String email;
	
	@Column(name="authority")
	private String authority;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@Column(name="created")
	private Date created;
	
	@Column(name="updated")
	private String updated;
	
}
	
	