package com.slokam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity		//to save the data
@Table(name = "employeedata") //it creates table 
public class employeedata {
	
	@Id //primary key for eid
	@GeneratedValue //auto increment for eid
	@Column(name = "eid")  //creates column name in table
	private int eid;
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name = "esal")
	private double esal;
	
	@Column(name =  "edseg")
	private String edesg;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	
	

}
