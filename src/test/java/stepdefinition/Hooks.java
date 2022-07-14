package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeHookTest() {
		System.out.println("This is before hook");
	}
	
	@After
	public void afterHookTest() {
		System.out.println("This is after hook");
	}

}
