package Applebees;

import java.io.IOException;
import java.util.ArrayList;

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

import com.aventstack.extentreports.Status;

//import p1.demo;
import pageobjectmodel.ConfirmRestaurantPageObjecs;
import pageobjectmodel.HomePageObjects;
import pageobjectmodel.LoginPageObjects;
import pageobjectmodel.MenuPageObject;
import pageobjectmodel.ModifierPageObjects;
import pageobjectmodel.OrdermethodsObjects;
import pageobjectmodel.SamplerPageObjecs;
import resources.Base;
import resources.dataDriver;

public class ApsHomePageTest extends Base{
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	
	public WebDriverWait wait,wait1;
	public dataDriver d = new dataDriver();
//	public JavascriptExecutor executor = (JavascriptExecutor)driver;
	public WebElement e,e1,e2,e3,e4;
	
	
	@Test
	public void hp() throws IOException
	
	{
		test = extent.createTest("test");
		HomePageObjects ho = new HomePageObjects(driver);
		
		ho.Signin().click();
	
	    LoginPageObjects lpo = new LoginPageObjects(driver);
		
		ArrayList<String> data = d.getData("Login1");
        System.out.println(data.get(1));
		System.out.println(data.get(2));
		lpo.Emailid().sendKeys(data.get(1));
		lpo.Pwd().sendKeys(data.get(2));
		
		System.out.println("Valid Credentials");
		lpo.Login().click();
		lpo.MenuClickClick().click();
		lpo.Locsubnav().click();
		lpo.Changestore().click();
		lpo.ChangestoreEnterText().clear();
		
		ArrayList<String> data1 = d.getData("Location1");
		lpo.ChangestoreEnterText().sendKeys(data1.get(1));
		System.out.println(data1.get(1));
		lpo.GoButtonClick().click();
		lpo.clickchangeres().click();			
	
		
		MenuPageObject mo = new MenuPageObject(driver);
		
		e = mo.Clickitem();
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();",e);
		
		ModifierPageObjects mpo = new ModifierPageObjects(driver);
		
		e1 =  mpo.SelectM1();
		executor.executeScript("arguments[0].click();",e1); 
		e2 = mpo.SelectNM1();
		executor.executeScript("arguments[0].click();",e2);
		e3 =  mpo.SelectM2();
		executor.executeScript("arguments[0].click();",e3);
		mpo.Submit().click();
		
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
		
		e4 =  mpo.Po();
		executor.executeScript("arguments[0].click();",e4);
		test.log(Status.PASS,"Pass");
    }
}
	
