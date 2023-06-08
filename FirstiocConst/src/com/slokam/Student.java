package com.slokam;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int sid;
	private String sname;
	private List<String> clgname;
	private Set<Double> marks;
	private Map<String, Double> smarks;

	public Student() {

	}

	public Student(int sid, String sname, List<String> clgname, Set<Double> marks, Map<String, Double> smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.clgname = clgname;
		this.marks = marks;
		this.smarks = smarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", clgname=" + clgname + ", marks=" + marks + ", smarks="
				+ smarks + "]";
	}

	
	

}
