package dev.ui.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class SessionScope implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public String getHashCode() {
		System.out.println("Session Scoped"+this.hashCode());
		return this.hashCode()+"";
	}
	@PostConstruct	
	public void postConstruc() {
		System.out.println("Session Scoped Object Creared.");
	}
	
	@PreDestroy
	public void preDestro() {
		System.out.println("Session Scoped Object handed over to GC.");
	}
}
