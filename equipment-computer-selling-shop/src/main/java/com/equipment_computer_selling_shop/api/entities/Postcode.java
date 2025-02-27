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
@Table(name = "postcodes")
public class Postcode {

	@Id
	@Column(columnDefinition = "CHAR(5)")
	private String postcode;
	
	@OneToMany(mappedBy = "postcode")
	private Set<Subdistrict> subdistrict;
	
}
