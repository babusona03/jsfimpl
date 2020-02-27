package dev.ui.producer;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import dev.ui.entity.Staff;

@RequestScoped			//Required, else Injection Point was not getting resolved. 
public class EntityManagerProducer {
	@Produces	
	private Staff staff;
	
	/*@Produces
	@PersistenceContext
	EntityManager entityManager;*/
}
