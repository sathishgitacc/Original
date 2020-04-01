package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamplerPageObjecs {
	
WebDriver driver;
	
	public SamplerPageObjecs(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By mod = By.xpath("//a[@modifiername='Brew Pub Pretzels & Beer Dip']");
	
	By Atd = By.xpath("//span[@class='customization-cta-buttontext']");
	
	public WebElement Clickmod()
	{
		return driver.findElement(mod);
	}
	
	
	public WebElement ClickAtd()
	{
		return driver.findElement(Atd);
	}

}
