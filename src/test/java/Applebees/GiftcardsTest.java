package Applebees;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import pageobjectmodel.GCPageObjects;
import pageobjectmodel.HomePageObjects;
import resources.Base;

public class GiftcardsTest extends Base
{


@Test
public void gcpage() throws IOException
{
	test = extent.createTest("test1");
	HomePageObjects ho = new HomePageObjects(driver);
	ho.findmenu().click();	
	GCPageObjects gco = new GCPageObjects(driver);
	gco.Clickcyb().click();
	gco.Clickbut().click();
	test.log(Status.PASS,"Pass");
	
}
}
