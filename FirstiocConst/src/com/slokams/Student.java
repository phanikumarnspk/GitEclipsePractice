package com.slokams;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Student {
	
	
	private int sid;
	private String sname;
	private List<College> sbranch;
	private Set<College> sdesg;
	private Map<College, Double> smarks;
	@Override
	public String toString() {
		return "sid=" + sid + ", sname=" + sname + ", sbranch=" + sbranch + ", sdesg=" + sdesg + ", smarks="
				+ smarks ;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(sbranch, sdesg, sid, smarks, sname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(sbranch, other.sbranch) && Objects.equals(sdesg, other.sdesg) && sid == other.sid
				&& Objects.equals(smarks, other.smarks) && Objects.equals(sname, other.sname);
	}
	
	
	public Student(int sid, String sname, List<College> sbranch, Set<College> sdesg, Map<College, Double> smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sbranch = sbranch;
		this.sdesg = sdesg;
		this.smarks = smarks;
	}
	
	
	
	
	

}
