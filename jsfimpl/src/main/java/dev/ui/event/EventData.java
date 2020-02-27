package dev.ui.event;

import java.time.LocalDateTime;

import dev.ui.model.Student;

//this is the event payload,carries all the necessary information that is to be used by the observer
public class EventData {
	private Student student;
	private LocalDateTime loginTime;
	
	
	public EventData() {
		super();
	}


	public EventData(Student student, LocalDateTime loginTime) {
		super();
		this.student = student;
		this.loginTime = loginTime;
	}


	public LocalDateTime getLoginTime() {
		return loginTime;
	}


	public void setLoginTime(LocalDateTime loginTime) {
		this.loginTime = loginTime;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
	
}
