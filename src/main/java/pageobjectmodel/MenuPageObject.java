package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPageObject {
	
WebDriver driver;
	
	public MenuPageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Item = By.xpath("//a[@href='/en/menu/build-your-sampler/build-your-sampler-choose-2']");
	
	public WebElement Clickitem()
	{
		return driver.findElement(Item);
	}

}
