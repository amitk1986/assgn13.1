package com.diablo.assgn131;

public class Beean {
	

	    private Dependency dep;
	    
	    public void execute() {
	        dep.foo();
	        dep.bar();
	    }
	    
	    public void setDep(Dependency dep) {
	        this.dep = dep;
	    }
	
}
