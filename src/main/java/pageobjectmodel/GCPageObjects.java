package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GCPageObjects 
{
	WebDriver driver;
	public GCPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cyb = By.xpath("//a[@title='Check Your Balance']");
	
	By closebut = By.xpath("//button[@role='button'][2]");
	
	public WebElement Clickcyb()
	{
		return driver.findElement(cyb);
	}
	
	public WebElement Clickbut()
	{
		return driver.findElement(closebut);
	}

}
