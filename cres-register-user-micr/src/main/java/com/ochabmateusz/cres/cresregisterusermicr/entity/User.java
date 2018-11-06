package com.ochabmateusz.cres.cresregisterusermicr.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="userss")
@EntityListeners(AuditingEntityListener.class)//uzywane  do automatycznego tworzenia pol created,updated
@JsonIgnoreProperties(value= {"created","updated"},allowGetters=true)
public class User {
	
	
	
	@Getter @Id
	@GeneratedValue
	private Long id;
	
	@Getter @Setter @NotBlank
	@Column(name="name")
	private String name;
	
	@Getter @Setter @NotBlank
	@Column(name="password")
	private String password;
	
	@Getter @Setter @NotBlank
	@Column(name="hashedpassw")
	private String hashedpassw;
	
	@Getter @Setter @NotBlank
	@Column(name="email")
	private String email;
	
	@Getter @Setter @NotBlank
	@Column(name="authority")
	private String authority;
	
	
	@Getter @Setter
	@Column(name="enabled")
	private String enabled;
	

	@Column(name="created", nullable=false, updatable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date created;
	
	@Column(name="updated", nullable=false)
	@Temporal(TemporalType.TIMESTAMP)
	@LastModifiedDate
	private Date updated;
	
	public User(@NotBlank String name, @NotBlank String password, @NotBlank String email, @NotBlank String hashedpassw,
			@NotBlank String authority) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.hashedpassw=hashedpassw;
		this.authority=authority;
		
	}
	
	
}
