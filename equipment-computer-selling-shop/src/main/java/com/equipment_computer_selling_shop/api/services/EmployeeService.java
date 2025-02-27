package com.equipment_computer_selling_shop.api.services;

import com.equipment_computer_selling_shop.api.repositories.EmployeeRepository;

public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
		
		this.employeeRepository = employeeRepository;
		
	}
	
	

}
