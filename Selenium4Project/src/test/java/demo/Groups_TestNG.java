package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClass"})
public class Groups_TestNG {
	
	@Test(groups = {"sanity"})
	public void test1() {
		
	}
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		
	}
	@Test(groups = {"regression","smoke"})
	public void test3() {
		
	}
	@Test
	public void test4() {
		
	}

}
