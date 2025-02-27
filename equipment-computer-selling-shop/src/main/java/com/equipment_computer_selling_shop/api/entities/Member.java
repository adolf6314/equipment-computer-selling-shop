package com.equipment_computer_selling_shop.api.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
@Table(name = "members")
public class Member extends User {
	
	@OneToMany(mappedBy = "member")
	private Set<MemberAddress> memberAddresses;
	
	@OneToOne(mappedBy = "member")
	private PasswordResetToken passwordResetToken;

}
