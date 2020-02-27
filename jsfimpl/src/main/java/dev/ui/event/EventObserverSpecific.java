package dev.ui.event;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import dev.ui.annotation.SpecificEvent;

@RequestScoped
public class EventObserverSpecific {

	@Inject
	Logger logger;

	//this event is container invoked, its called upon reaching the notifier method: eventBean.logIn(), container delivers payload object.
	//must receive similar payload as declared in Event<PayLoad>  
	void simpleEventObserverSpecific(@Observes @SpecificEvent EventData eventData) {
		logger.log(Level.INFO, "user {0} {1} logged in @ {2}:logged from Specific event observer @ EventObserverSpecific .", new Object[]{eventData.getStudent().getfName(),eventData.getStudent().getlName(),eventData.getLoginTime() });
	}
}
