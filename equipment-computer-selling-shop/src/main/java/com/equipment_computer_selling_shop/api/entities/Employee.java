package com.equipment_computer_selling_shop.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
@Entity
@Table(name = "employees")
public class Employee extends User {
	
	@Column(nullable = false)
	private Character status = '1';
	
	@Column(length = 100, nullable = false)
	private String address;
	
	@ManyToOne
	@JoinColumn(name = "role_id", referencedColumnName = "id", nullable = false)
	private Role role;
	
	@ManyToOne
	@JoinColumn(name = "sdist_id", referencedColumnName = "id", nullable = false)
	private Subdistrict subdistrict;
	
	@OneToOne(mappedBy = "employee")
	private PasswordResetToken passwordResetToken;

}
