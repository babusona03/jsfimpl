package dev.ui.model;



import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.ApplicationScoped;



import dev.ui.annotation.Logged;



@ApplicationScoped
public class ApplicationScope {
	
	@Logged
	public String getHashCode() {
		System.out.println("Application Scoped"+this.hashCode());
		return this.hashCode()+"";
	}
	
	@PostConstruct	
	public void postConstruc() {
		System.out.println("Application Scoped Object Creared.");
	}
	
	@PreDestroy
	public void preDestro() {
		System.out.println("Application Scoped Object handed over to GC.");
	}
}
