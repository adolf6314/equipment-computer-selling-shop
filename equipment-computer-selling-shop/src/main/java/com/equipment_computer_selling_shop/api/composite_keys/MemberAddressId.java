package com.equipment_computer_selling_shop.api.composite_keys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class MemberAddressId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(length = 100)
	private String address;
	
	@Column(name = "mem_id")
	private String memberId;
	
	@Column(name = "sdist_id")
	private String subdistrictId;

}
