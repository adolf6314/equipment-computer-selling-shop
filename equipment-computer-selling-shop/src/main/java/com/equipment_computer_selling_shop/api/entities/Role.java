package com.equipment_computer_selling_shop.api.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@ToString
@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@Column(length = 3)
	private String id;
	
	@Column(length = 100, nullable = false)
	private String nameEn;
	
	@Column(length = 100, nullable = false)
	private String nameTh;
	
	@OneToMany(mappedBy = "role")
	private Set<Employee> employees;

}
