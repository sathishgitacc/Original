package Applebees;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.Footerlinks;
import resources.Base;

public class NutritionandallergenTest extends Base

{

	@BeforeClass(alwaysRun = true)
	public void beforeclassnttest()
	{
		testCaseName = "Footer Link";
   	    testCaseDesc =  "Footer Link Desc";
		category = "Smoke";
		author = "Sathish";	
	}

	@Test
	public void cb1() throws IOException, InterruptedException
	
	{
		Footerlinks fl = new Footerlinks(driver);		
		fl.clickfooter().click();
		
	}
}
