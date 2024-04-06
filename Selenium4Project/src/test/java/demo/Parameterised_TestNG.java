package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterised_TestNG {
	
	@Parameters({"MyName"})
	@Test
	public void test1(@Optional("Boss") String name) {
		System.out.println("I am "+ name);
	}

}
