package dev.ui.model;


import javax.enterprise.context.RequestScoped;

import javax.inject.Named;


@Named
@RequestScoped
public class Student{

	
	private String fName;
	private String lName;
	
	public Student() {		
	}
	
	public String getfName() {
		System.out.println("STUDENT getFname()");
		return fName;
	}
	public void setfName(String fName) {
		System.out.println("STUDENT setFname()");
		this.fName = fName;
		
	}
	
	public String getlName() {
		System.out.println("STUDENT getLname()");
		return lName;
	}
	public void setlName(String lName) {
		System.out.println("STUDENT setLname()");
		this.lName = lName;
	}
	
	
}

