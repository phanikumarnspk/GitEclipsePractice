package com.slokam.script.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Time {
  
	@Id
	@GeneratedValue
	private Integer id;
    private String description;
  
}
