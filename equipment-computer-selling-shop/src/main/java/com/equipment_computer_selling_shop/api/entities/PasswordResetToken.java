package com.equipment_computer_selling_shop.api.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
@ToString
@Entity
@Table(name = "password_reset_tokens")
public class PasswordResetToken {
	
	@Id
	@Column(columnDefinition = "CHAR(13)")
	private String id;
	
	@Column(nullable = false)
	private LocalDateTime expireData;
	
	@Column(columnDefinition = "CHAR(8)", nullable = false)
	private String token;
	
	private boolean used = false;
	
	@OneToOne
	@JoinColumn(name = "emp_id", referencedColumnName = "id")
	private Employee employee;
	
	@OneToOne
	@JoinColumn(name = "mem_id", referencedColumnName = "id")
	private Member member;

}
