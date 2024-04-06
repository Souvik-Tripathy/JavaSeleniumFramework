package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups = "All")
public class IgnoreTest_TestNG {
	@Test
	public void test1() {
		System.out.println("ttttest 1 it is");
		
	}
	@Test
	@Ignore
	public void test2() {
		System.out.println("ttttest 2 it is");
		
	}
	@Test
	public void test3() {
		System.out.println("ttttest 3 it is");
		
	}
	@Test
	public void test4() {
		System.out.println("ttttest 4 it is");
		
	}

}
