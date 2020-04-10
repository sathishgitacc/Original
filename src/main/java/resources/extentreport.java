package resources;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreport
{
	
	public static ExtentReports extent;
	public static ExtentTest test;
	//public static ExtentHtmlReporter html;
	public static String testCaseName,testCaseDesc,category,author;
	
@BeforeSuite()
public void beginResult() 
{
	
	ExtentHtmlReporter html = new ExtentHtmlReporter("./reports/result.html");
   // html.setAppendExisting(false);
	extent = new ExtentReports();

	extent.attachReporter(html);
}

public void startTestCase() {
	test = extent.createTest(testCaseName, testCaseDesc);
	test.assignCategory(category);
	test.assignAuthor(author);
}

@AfterSuite()
public void endResult() 
{
	extent.flush();
}

}