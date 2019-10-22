package com.SpringBootWithJPA.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name="userid")
	private int userId;
	@Column(name="passwords")
	private String password;
	
	@Column(name="domain")
	private String domain;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public User(int userId, String password, String domain) {
		super();
		this.userId = userId;
		this.password = password;
		this.domain = domain;
	}

	public User() {
		super();
		
	}


	
	
}
