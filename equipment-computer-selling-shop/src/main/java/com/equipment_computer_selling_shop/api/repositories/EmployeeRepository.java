package com.equipment_computer_selling_shop.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.equipment_computer_selling_shop.api.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

	@Query("SELECT e.id FROM Employee e ORDER BY e.id DESC LIMIT 1")
	String findLatestId();
	
	boolean existsById(String id);
}
