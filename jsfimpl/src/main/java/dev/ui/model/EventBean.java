package dev.ui.model;

import java.time.LocalDateTime;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;

import dev.ui.annotation.SpecificEvent;
import dev.ui.event.EventData;
import dev.ui.model.Student;

@Named
@RequestScoped
public class EventBean {
	
	@Inject
	private Student student;
	
	@Inject
	private Event<EventData> simpleEvent;//this is the payload:EventDatagets injected
	
	@Inject
	@SpecificEvent
	private Event<EventData> specificEvent;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	public void logIn()	{
			simpleEvent.fire(new EventData(this.getStudent(),LocalDateTime.now()));//this method is the thrower of payload,notifies that it is executing.
			System.out.println();System.out.println();System.out.println();
			specificEvent.fire(new EventData(this.getStudent(),LocalDateTime.now()));
	}
}
