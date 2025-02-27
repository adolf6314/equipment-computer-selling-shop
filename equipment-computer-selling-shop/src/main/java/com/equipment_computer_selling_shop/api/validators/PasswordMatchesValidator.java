package com.equipment_computer_selling_shop.api.validators;

import com.equipment_computer_selling_shop.api.constraints.PasswordMatchesConstraint;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordMatchesValidator implements ConstraintValidator<PasswordMatchesConstraint, Object> {

	@Override
	public void initialize(PasswordMatchesConstraint constraintAnnotation) {

	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
