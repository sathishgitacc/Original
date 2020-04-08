package Applebees;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.GCPageObjects;
import pageobjectmodel.HomePageObjects;
import resources.Base;

public class GiftcardsTest extends Base
{


@Test
public void gcpage() throws IOException
{
	
	HomePageObjects ho = new HomePageObjects(driver);
	ho.findmenu().click();	
	GCPageObjects gco = new GCPageObjects(driver);
	gco.Clickcyb().click();
	gco.Clickbut().click();
	
}
}
