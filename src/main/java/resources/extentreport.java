package resources;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport
{
	
	public static ExtentReports extent;
	public static ExtentTest test;
	//public static ExtentHtmlReporter html;
	public static String testCaseName,testCaseDesc,category,author;
	
@BeforeSuite(alwaysRun = true)
public void beginResult() 
{
	
	ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
  // ((Object) html).setAppendExisting(false);
	extent = new ExtentReports();

	extent.attachReporter(html);
}

@BeforeMethod(alwaysRun = true)
public void startTestCase(ITestResult result)
{

	test = extent.createTest(testCaseName, testCaseDesc);
	test.assignCategory(category);
	test.assignAuthor(author);
}

@AfterMethod(alwaysRun = true)
public static void getResult(ITestResult result) throws IOException 
{
	if(result.getStatus()== ITestResult.SUCCESS)
	{
		test.pass(MarkupHelper.createLabel("Passed",ExtentColor.GREEN));
	}
	
	if(result.getStatus()== ITestResult.FAILURE)
	{
		
		String s = Base.getSS(result.getName());
		test.fail(MarkupHelper.createLabel("Failed",ExtentColor.RED));
	    test.addScreenCaptureFromPath("./." + s);
		System.out.println(s);
		
	}
}

@AfterSuite(alwaysRun = true)
public void endResult() 
{
	extent.flush();
}

}