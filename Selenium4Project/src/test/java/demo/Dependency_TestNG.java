package demo;

import org.testng.annotations.Test;

@Test(groups = "AllClass")
public class Dependency_TestNG {
	@Test(dependsOnMethods = {"test3"})
	public void test1() {
		System.out.println("this is test 1");
	}
	@Test(groups = {"sanity1"})
	public void test2() {
		System.out.println("this is test 2");
	}
	@Test(dependsOnGroups = {"sanity1"})
	public void test3() {
		System.out.println("this is test 3");
	}

}
