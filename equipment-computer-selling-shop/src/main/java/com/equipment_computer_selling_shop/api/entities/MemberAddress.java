package com.equipment_computer_selling_shop.api.entities;

import com.equipment_computer_selling_shop.api.composite_keys.MemberAddressId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "member_address")
public class MemberAddress {
	
	@EmbeddedId
	private MemberAddressId memberAddressId;
	
	@ManyToOne
	@MapsId("memberId")
	@JoinColumn(name = "mem_id", columnDefinition = "VARCHAR(12)")
	private Member member;
	
	@ManyToOne
	@MapsId("subdistrictId")
	@JoinColumn(name = "sdist_id", columnDefinition = "VARCHAR(5)")
	private Subdistrict subdistrict;

}
