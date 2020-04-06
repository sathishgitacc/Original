package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ModifierPageObjects {
	
WebDriver driver;
	
	public ModifierPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By fm = By.xpath("//input[@modifiername='No sauce']");
	By fnm = By.xpath("//a[@modifiername='Fries']/img");
	By sm = By.xpath("//li[@menuitemid = '3613536956']/div/a");
	By snm = By.linkText("DONE");
	By ato = By.className("customization-cta-buttontext");
	By ci = By.xpath("//a[@id='MyCart']/i");
	By cb = By.xpath("//a[@class='lnkViewCart']");
	By ptc = By.xpath("//a[@title='Proceed to Checkout']");
	By pis = By.xpath("//li[@data-item='c-paymentoptions__payinstore']");
	//By plo = By.xpath("//a[@href='/en/order/confirmation']");
	By plo = By.xpath("//a[@title='Place Order']");
	
	public WebElement SelectM1()
	{
		return driver.findElement(fm);
	}
	
	public WebElement SelectNM1()
	{
		return driver.findElement(fnm);
	}
	
	public WebElement SelectM2()
	{
		return driver.findElement(sm);
	}
	
	public WebElement SelectNM2()
	{
		return driver.findElement(snm);
	}
	
	public WebElement Submit()
	{
		return driver.findElement(ato);
	}
	
	public WebElement CartIcon()
	{
		return driver.findElement(ci);
	}
	
	public WebElement Checkout()
	{
		return driver.findElement(cb);
	}
	
	public WebElement Ptc()
	{
		return driver.findElement(ptc);
	}

	public WebElement Pai()
	{
		return driver.findElement(pis);
	}
	public WebElement Po()
	{
		return driver.findElement(plo);
	}
	
}
