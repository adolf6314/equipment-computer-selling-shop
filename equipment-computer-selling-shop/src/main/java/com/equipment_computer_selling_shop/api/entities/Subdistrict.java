package com.equipment_computer_selling_shop.api.entities;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "subdistricts")
public class Subdistrict {
	
	@Id
	@Column(length = 5)
	private String id;
	
	@Column(length = 100, nullable = false)
	private String nameEn;
	
	@Column(length = 100, nullable = false)
	private String nameTh;
	
	@ManyToOne
	@JoinColumn(name = "postcode", referencedColumnName = "postcode", nullable = false)
	private Postcode postcode;
	
	@ManyToOne
	@JoinColumn(name = "dist_id", referencedColumnName = "id", nullable = false)
	private District district;
	
	@OneToMany(mappedBy = "subdistrict")
	private Set<Employee> employees;

}
