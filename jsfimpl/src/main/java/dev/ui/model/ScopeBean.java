package dev.ui.model;

import javax.enterprise.context.ApplicationScoped;
//import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ApplicationScoped
public class ScopeBean {
	
	@Inject
	RequestScope requestScope;
	
	@Inject
	SessionScope sessionScope;
	
	@Inject
	ApplicationScope applicationScope;
	
	@Inject
	DependentScope dependentScope;

	public String getRequestScope() {
		return requestScope.getHashCode();
	}

	public String getSessionScope() {
		return sessionScope.getHashCode();
	}

	public String getApplicationScope() {
		return applicationScope.getHashCode();
	}

	public String getDependentScope() {
		return dependentScope.getHashCode();
	}
}
