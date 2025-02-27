package com.equipment_computer_selling_shop.api.dtos;

import com.equipment_computer_selling_shop.api.constraints.PasswordMatchesConstraint;

import jakarta.persistence.PrePersist;
import jakarta.validation.Valid;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeDTO {
	
	@Valid
	private Identity identity;
	
	@Valid
	private Address address;

	@Data
	@Builder
	@PasswordMatchesConstraint
	public static class Identity {
		
		private String firstname;
		private String lastname;
		private String username;
		private String email;
		private String password;
		private String confirmPassword;
		private String phone;
		private String gender;
		private String role;
		
		@PrePersist
		public void setDefaultValues() {
			
			if (this.firstname == null) this.firstname = "";
			if (this.lastname == null) this.lastname = "";
			if (this.username == null) this.username = "";
			if (this.email == null) this.email = "";
			if (this.password == null) this.password = "";
			if (this.confirmPassword == null) this.confirmPassword = "";
			if (this.phone == null) this.phone = "";
			if (this.gender == null) this.gender = "";
			if (this.role == null) this.role = "";
			
		}

	}
	
	@Data
	@Builder
	public static class Address {
		
		private String address;
		private String region;
		private String province;
		private String district;
		private String subdistrict;
		
	}

}
