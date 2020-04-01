package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfirmRestaurantPageObjecs {
	
WebDriver driver;
	
	public ConfirmRestaurantPageObjecs(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By cr = By.xpath("//a[@title='CONFIRM']");
	
	public WebElement ClickCR()
	{
		return driver.findElement(cr);
	}

}
