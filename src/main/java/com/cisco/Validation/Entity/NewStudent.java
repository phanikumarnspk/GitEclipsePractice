package com.cisco.Validation.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class NewStudent {

	@Id
	@GeneratedValue
	private Integer sid;
	private String sname;
	private Double smarks;
	private String Squal;
	private Long phone;

}
