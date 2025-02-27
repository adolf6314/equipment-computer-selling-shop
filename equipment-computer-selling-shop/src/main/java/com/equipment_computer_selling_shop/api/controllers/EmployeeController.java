package com.equipment_computer_selling_shop.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	private Map<String, String> detailForCreateOrUpdate() {
		
		Map<String, String> response = new HashMap<>();
		
		response.put("genders", "Kuy");
		
		return response;
	}
	
	@GetMapping
	public ResponseEntity<?> create() {
		
		Map<String, String> response = detailForCreateOrUpdate();
		
		return ResponseEntity.ok(response);
	}

}
