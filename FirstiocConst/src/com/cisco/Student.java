package com.cisco;

public class Student {
	
	
	private int sid;
	private String sname;
	private int age;
	
	
	
	
	 public Student(int sid, String sname, int age) {
	 
	 this.sid = sid; this.sname = sname; this.age = age; }
	  
	 
	  public Student(int sid, String sname) {
	 
	  this.sid = sid; this.sname = sname; }
	  
	 
	public Student(int sid) {
		
		this.sid = sid;
	}
	
	public Student()
	{
		
		
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", age=" + age + "]";
	}
	
	

}
