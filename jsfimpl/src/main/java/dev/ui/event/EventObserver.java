package dev.ui.event;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import dev.ui.event.EventData;;
//import dev.ui.annotation.SpecificEvent;

@RequestScoped
public class EventObserver {

	@Inject
	Logger logger;
	/*
	 * 
	 * An observer matches an event if its type is in the event types set and if the observer has a subset of the qualifier of the event.
	 * */
	//this event is container invoked, its called upon reaching the notifier method: eventBean.logIn(), container delivers payload object.
	//must receive similar payload as declared in Event<PayLoad>  
	void simpleEventObserver(@Observes @Default EventData eventData) { //without @default;it will be treated as any, would also catch qualified events
		logger.log(Level.INFO, "user {0} {1} logged in @ {2}:logged from simple event observer @ EventObserver.", new Object[]{eventData.getStudent().getfName(),eventData.getStudent().getlName(),eventData.getLoginTime() });
	}
//	void simpleEventObserverTwo(@Observes @Default EventData eventData) {
//		logger.log(Level.INFO, "user {0} {1} logged in @ {2}:logged from simple event observer Two @ EventObserver.", new Object[]{eventData.getStudent().getfName(),eventData.getStudent().getlName(),eventData.getLoginTime() });
//	}
//	void specificEventObserver(@Observes @SpecificEvent EventData eventData) {
//		logger.log(Level.INFO, "user {0} {1} logged in @ {2}:logged from Specific event observer @ EventObserver.", new Object[]{eventData.getStudent().getfName(),eventData.getStudent().getlName(),eventData.getLoginTime() });
//	}
}
