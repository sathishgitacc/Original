package Applebees;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.HomePageObjects;
import resources.Base;

public class ApsMenuDisplayed extends Base 



{
	public static Logger log= LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void sb() throws IOException
	{
		driver = startbrowser();
	
	}
	@AfterTest
	public void cb() throws IOException, InterruptedException
	
	{
		//wait = new WebDriverWait(driver,3);
		//.driverwait.withTimeout(timeout)
		Thread.sleep(1000);
		driver.close();
	}
	
	@Test
	public void hp() throws IOException
	{
		//driver.get("https://www.applebees.com/en");
		HomePageObjects ho = new HomePageObjects(driver);
		boolean b =ho.findmenu().isEnabled();
		System.out.println(b);
    }
	
}
