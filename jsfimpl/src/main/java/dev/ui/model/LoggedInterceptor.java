package dev.ui.model;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;

import javax.inject.Inject;
import javax.inject.Named;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;



import dev.ui.annotation.Logged;
@Named
@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION)
public class LoggedInterceptor {
	@Inject	
	private Logger logger;
	private String user ="Mr. Gamer";
	@AroundInvoke
	public Object logMethodCall(InvocationContext context) throws Exception {
		logger.log(Level.INFO, "user {0} invoked {1} method at{2}", new Object[] {user, context.getMethod().getName(), LocalDate.now()});
		return context.proceed();
	}
}
