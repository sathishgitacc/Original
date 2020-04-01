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
	
	By fm = By.xpath("//li[@menuitemid='205371395']/div[2]/p");
	By fnm = By.linkText("DONE");
	By sm = By.xpath("//input[@value='205371412']");
	By snm = By.linkText("DONE");
	By ato = By.xpath("//a[@class='AddToOrder']");
	By ci = By.xpath("//a[@id='MyCart']/i");
	By cb = By.xpath("//a[@class='lnkViewCart']");
	By ptc = By.xpath("//a[@title='Proceed to Checkout']");
	By pis = By.xpath("//li[@data-item='c-paymentoptions__payinstore']");
	By plo = By.xpath("//a[@href='/en/order/confirmation']");
	
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
