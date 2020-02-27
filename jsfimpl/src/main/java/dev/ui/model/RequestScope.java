package dev.ui.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RequestScope {
	public String getHashCode() {
		System.out.println("Request Scoped"+this.hashCode());
		return this.hashCode()+"";
	}
	
	@PostConstruct	
	public void postConstruc() {
		System.out.println("Request Scoped Object Creared.");
	}
	
	@PreDestroy
	public void preDestro() {
		System.out.println("Request Scoped Object handed over to GC.");
	}
}
