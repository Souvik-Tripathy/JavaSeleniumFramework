package listners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listners.TestNGListeners.class)
public class TestNGListeners_Demo2 {
	
	@Test
	public void test4() {
		System.out.println("in test4");
	}
	@Test
	public void test5() {
		System.out.println("in test5");
	}
	@Test
	public void test6() {
		System.out.println("in test6");
		throw new SkipException("skipping the test");
	}

}
