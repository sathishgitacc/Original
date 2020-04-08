package Applebees;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import resources.Base;

public class LoginPage extends Base

{

	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =startbrowser();
	}
	
	@AfterTest
	public void cb() throws IOException, InterruptedException
	
	{
		
		Thread.sleep(1000);
		driver.close();
		
	}
}
