package dev.ui.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class DependentScope {
	public String getHashCode() {
		System.out.println("Dependent Scoped"+this.hashCode());
		return this.hashCode()+"";
	}
	
	@PostConstruct	
	public void postConstruc() {
		System.out.println("Dependent Scoped Object Creared.");
	}
	
	@PreDestroy
	public void preDestro() {
		System.out.println("Dependent Scoped Object handed over to GC.");
	}
}
