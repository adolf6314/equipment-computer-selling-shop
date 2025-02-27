package com.equipment_computer_selling_shop.api.constraints;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.equipment_computer_selling_shop.api.validators.PasswordMatchesValidator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = {PasswordMatchesValidator.class})
@Retention(RUNTIME)
@Target(TYPE)
public @interface PasswordMatchesConstraint {
	
	String message() default "Password must be match";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
