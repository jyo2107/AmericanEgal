package Iblesoft.AmericanEgal;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListnersclass1 extends Basecls implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName());
      captureScreenshot(result.getMethod().getMethodName()+".jpg");	
	}
	}
	
	


