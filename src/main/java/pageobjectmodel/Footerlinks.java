package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footerlinks {
	
WebDriver driver;
	
	public Footerlinks (WebDriver driver)
	{
		this.driver = driver;
	}
	
	By Nutrition = By.xpath("//div[@id='section_footer']/ul/li/a[@href='/en/nutrition']");
	
	public WebElement clickfooter()
	{
		return driver.findElement(Nutrition);
	}

}
