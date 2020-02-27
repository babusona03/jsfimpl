package dev.ui.event;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Default;
import javax.inject.Inject;

@RequestScoped
public class EventObserverTwo {

	@Inject
	Logger logger;
	
	//this event is container invoked, its called upon reaching the notifier method: eventBean.logIn(), container delivers payload object.
	//must receive similar payload as declared in Event<PayLoad>  
	void simpleEventObserverTwo(@Observes @Default EventData eventData) {
		logger.log(Level.INFO, "user {0} {1} logged in @ {2}:logged from simple event observer Two @ EventObserverTwo.", new Object[]{eventData.getStudent().getfName(),eventData.getStudent().getlName(),eventData.getLoginTime() });
	}
}
