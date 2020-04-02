package Applebees;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//import p1.demo;
import pageobjectmodel.ConfirmRestaurantPageObjecs;
import pageobjectmodel.HomePageObjects;
import pageobjectmodel.LoginPageObjects;
import pageobjectmodel.MenuPageObject;
import pageobjectmodel.ModifierPageObjects;
import pageobjectmodel.OrdermethodsObjects;
import pageobjectmodel.SamplerPageObjecs;
import resources.Base;

public class ApsHomePage extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	public WebDriverWait wait,wait1;
	
	
	@BeforeTest
	public void sb() throws IOException
	{
		driver = startbrowser();
		log.info("browser started");
		System.out.println("Gittest1");
		
	}
	@AfterTest
	public void cb() throws IOException, InterruptedException
	
	{
		//wait = new WebDriverWait(driver,3);
		//.driverwait.withTimeout(timeout)
		
		Thread.sleep(1000);
		driver.close();
		log.info("browser closed");
		
	}
	
	@Test(priority = 0)
	public void hp() throws IOException
	{


		//driver.get("https://www.applebees.com/en");
		HomePageObjects ho = new HomePageObjects(driver);
		ho.Signin().click();
		log.info("Clicked Sign In");
    }
	

	@Test(priority = 1)
	public void lp() throws IOException
	{

	
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.Emailid().sendKeys("sathish.murugesan@aspiresys.com");
		lpo.Pwd().sendKeys("Newpass1!");
		System.out.println("Valid Credentials");
		lpo.Login().click();
		lpo.MenuClickClick().click();
		lpo.Locsubnav().click();
		lpo.Changestore().click();
		lpo.ChangestoreEnterText().clear();
		lpo.ChangestoreEnterText().sendKeys("Glendale,CA,USA");
		lpo.GoButtonClick().click();
		//lpo.DDSelector().click();
		lpo.clickchangeres().click();			
		//lpo.MenuClickClick().click();
	
	}
	
	@Test(priority = 2)
	public void mp()
	{
	
		driver.findElement(By.xpath("//li[@data-item-id='13585']/a")).click();
		
		//WebElement img = driver.findElement(By.xpath("//body[@data-id='{830D4D40-89B3-4356-B592-1D67D037A404}']"));
	
		
	
MenuPageObject mo = new MenuPageObject(driver);
	
	WebElement but1 = mo.Clickitem();
	
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",but1);
	
//Actions act = new Actions (driver);
//	act.moveToElement(img).click(but1).build().perform();
	//mo.Clickitem().click();

   }

	@Test(priority = 3)
	public void sp()
	{
		SamplerPageObjecs so = new SamplerPageObjecs(driver);
		WebElement but2 = so.Clickmod();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",but2);
		//so.Clickmod().click();
		//so.ClickAtd().click();
		
	}
	

    @Test(priority = 4)
   public void modpage() 
   {
	  ModifierPageObjects mpo = new ModifierPageObjects(driver);
	  
	   mpo.SelectM1().click();
	  mpo.SelectNM1().click();
	//wait = new WebDriverWait(driver,10);
	//wait.until(ExpectedConditions.visibilityOf(By.xpath("//input[@modifiername='Chicken Quesadilla']")));
	//WebElement e = wait.until(ExpectedConditions.visibilityOf(mpo.SelectM2()));
			 //visibilityOf(mpo.SelectM2()));
	 //  e.click();
	   mpo.SelectM2().click();
	   
	  mpo.SelectNM2().click();
	  mpo.Submit().click();
	//  mpo.CartIcon().click();
 wait = new WebDriverWait(driver,3);
	  
	  boolean inv1 = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='c-progress__spinner-container']")));
	  System.out.println(inv1);
   if(inv1)
   	{
  	 mpo.CartIcon().click();
     } 
	mpo.Checkout().click();
	mpo.Ptc().click();
	mpo.Pai().click();
	log.info("clicked pay in reataurant");
	Actions act = new Actions(driver);
	//act.moveToElement(mpo.Po()).build().perform();
	//mpo.Po().click();
	wait1 = new WebDriverWait(driver,6);
 boolean inv2 = wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@id='content-loading']")));
	//System.out.println(inv2);
 if(inv2)
 	{
	// mpo.Po().click();
   } 	
	
}
    
}
