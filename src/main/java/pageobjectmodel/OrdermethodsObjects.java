package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrdermethodsObjects {
	

WebDriver driver;
	
	public OrdermethodsObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Id = By.xpath("//div[@class='c-ordermethod__time-inner']/label/span");
	
	public By bt = By.xpath("//a[@title='Start adding to your cart']");
	
	public WebElement PI()
	{
		return driver.findElement(Id);
	}
	
	
	public WebElement butc()
	{
		return driver.findElement(bt);
	}
	
	

}
