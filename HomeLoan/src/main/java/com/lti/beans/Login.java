package com.lti.beans;

import javax.persistence.Column;
import javax.persistence.Id;

public class Login {
	
	@Id
	@Column(name = "user_id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOGIN_GEN")
//	@SequenceGenerator(name = "LOGIN_GEN", sequenceName = "login_id_seq")
	private Integer userId;
	
	
	private String username;
	
	private String password;
	
	private String role;
	
	


}
