package listners;

import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("***started :"+result.getName());
		
	}
	
public void onTestSuccess(ITestResult result) {
	
	System.out.println("***successful :"+result.getName());
		
	}
public void onTestFailure(ITestResult result) {
	System.out.println("***failed :"+result.getName());
	
}
public void onTestSkipped(ITestResult result) {
	System.out.println("***skipped :"+result.getName());
	
}
public void onTestFailedButwithinSuccessPercentage(ITestResult result) {
	
}
public void onStart(ITestResult result) {
	
}
public void onFinish(ITestResult result) {
	System.out.println("***finished :"+result.getName());
	
}




}
