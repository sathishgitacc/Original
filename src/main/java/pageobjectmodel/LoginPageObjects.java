package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
WebDriver driver;
	
	public LoginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username = By.xpath("//input[@name='Email']");
	By Pwd = By.id("loginPassword");
	By SignIn = By.xpath("//input[@value='Sign In To Your Account']");
	By Locdd = By.xpath("//span[@class='location-sub-nav-namefield']");
	By ChgStr = By.partialLinkText("Change");
	By ChgStrTxtbox = By.xpath("//div[@class='quick-location_input-container']/input");
	By GoButton = By.id("quick-location-search__button");
	By DDSelect = By.xpath("//div[@class='location-type-ahead-results']/ul/li[1]");
	By ChooseRest = By.partialLinkText("ALHAMBRA");
	//By MenuClick = By.partialLinkText("ORDER");
	By menu = By.xpath("//a[@href='/en/menu']");
	
	public WebElement Emailid()
	{
		return driver.findElement(username);
	}
	
	public WebElement Pwd()
	{
	
		return driver.findElement(Pwd);
    }
	
	
	public WebElement Login()
	{
		return driver.findElement(SignIn);
	}
	
	public WebElement Locsubnav()
	{
    
		return driver.findElement(Locdd);	
    }
	
	public WebElement Changestore()
	{
		return driver.findElement(ChgStr);
	}
	
	public WebElement ChangestoreEnterText()
	{
	
        return driver.findElement(ChgStrTxtbox);
    }
	
	public WebElement GoButtonClick()
	{
	
		return driver.findElement(GoButton);
	}
		
		public WebElement DDSelector()
		{
			return driver.findElement(DDSelect);
		}
		
		public WebElement clickchangeres()
		{
			
			return driver.findElement(ChooseRest);
         }
		
		public WebElement MenuClickClick()
		{
			return driver.findElement(menu);
        }
}