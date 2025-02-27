package com.equipment_computer_selling_shop.api.entities;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
	
	MALE("1", "Male", "ชาย"),
	FEMALE("2", "Female", "หญิง");
	
	private final String id;
	private final String nameEn;
	private final String nameTh;
	
	@JsonValue
    public Map<String, String> toJson() {
		
        Map<String, String> json = new HashMap<>();
        
        json.put("id", id);
        json.put("nameEn", nameEn);
        json.put("nameTh", nameTh);
        
        return json;
        
    }

}
