package DB;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.Base;
import resources.screenshot;

public class lis implements ITestListener{

	//@Override
	
	//Base b = new Base();
	screenshot s = new screenshot();
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		/*try {
			s.getSS(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
		
	

	//@Override
	//public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	//	try {
		//	s.getSS(result.getName());
		//} catch (IOException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
		
	//}

//	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	//	;
		try {
			s.getSS(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	//@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}



	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
