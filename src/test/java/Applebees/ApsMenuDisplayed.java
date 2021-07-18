package Applebees;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.HomePageObjects;
import resources.Base;

public class ApsMenuDisplayed extends Base 



{
	@BeforeClass(alwaysRun = true)
	public void beforeclassmenu()
	{
		testCaseName = "ApsMenuuDisplayed";
   	    testCaseDesc =  "ApsMenuuDisplayed Desc";
		category = "Smoke";
		author = "Sathish";	
	}
	@Test
	public void menudisplayed() throws IOException
	
	{
	
		HomePageObjects ho = new HomePageObjects(driver);
		boolean b =ho.findmenu().isEnabled();
		System.out.println(b);
    }
	
}
