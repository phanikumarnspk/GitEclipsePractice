package com.slokam.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Script {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
}
