package com.equipment_computer_selling_shop.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class User {

	@Id
	@Column(columnDefinition = "CHAR(12)")
	private String id;
	
	@Column(length = 100, nullable = false)
	private String firstname;
	
	@Column(length = 100, nullable = false)
	private String lastname;
	
	@Column(length = 100, nullable = false)
	private String username;
	
	@Column(length = 100, nullable = false)
	private String email;
	
	@Column(length = 70, nullable = false)
	private String password;
	
	@Column(columnDefinition = "CHAR(10)", nullable = false)
	private String phone;
	
	@Column(nullable = false)
	private Character gender;
	
	@Column(nullable = false)
	private Character online = '0';

}
