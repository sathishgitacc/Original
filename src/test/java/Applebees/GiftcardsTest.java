package Applebees;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjectmodel.GCPageObjects;
import pageobjectmodel.HomePageObjects;
import resources.Base;

public class GiftcardsTest extends Base
{

	@BeforeClass(alwaysRun = true)
	public void beforeclassgctest()
	{
		testCaseName = "GC Page TC Name";
   	    testCaseDesc =  "GC Page Desc";
		category = "Smoke";
		author = "Sathish";	
	}
@Test(groups = {"smoke"})
public void gcpage() throws IOException
{

	HomePageObjects ho = new HomePageObjects(driver);
	ho.findmenu().click();	
	GCPageObjects gco = new GCPageObjects(driver);
	gco.Clickcyb().click();
	gco.Clickbut().click();
//	test.log(Status.PASS,"Pass");
	
}
}
