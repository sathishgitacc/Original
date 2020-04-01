package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	

WebDriver driver;
	
	public HomePageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Login = By.xpath("//div[@class='header-sub__account']/a");
	By menu = By.xpath("/a[@href='/en/gift-cards']");
	By text = By.xpath("//h2[@class='module-title']");
	
	public WebElement Signin()
	{
		return driver.findElement(Login);
	}
	
	public WebElement findmenu()
	{
	return driver.findElement(menu);
	}
	
	public WebElement findtext()
	{
		return driver.findElement(text);
	}
	
	
	

}
