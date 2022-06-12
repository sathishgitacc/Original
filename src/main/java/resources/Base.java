package resources;

import java.io.File;
//import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;


public class Base extends extentreport

{
	
	
	public static WebDriver driver;
	public  Properties prop;
	public String url;
	//public WebDriverWait wait,wait1;
	//private File Null;
	//public File Null;
	//public File src;
	
	//source=null;
	
	public static Logger log= LogManager.getLogger(Base.class.getName());

	
	@BeforeTest(alwaysRun = true)
	public WebDriver startbrowser() throws IOException
	{
	
	prop = new Properties();
	FileInputStream fis = new FileInputStream("./src/main/java/resources/data.properties");
	prop.load(fis);
	
	
	//String browsername = System.getProperty("browser");
	
	String browsername = prop.getProperty("browser");
	
	if (browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	url = prop.getProperty("env");
	driver.get(url);
	
	/*if (TestEnv.equalsIgnoreCase("prod"))
	{
		driver.get("https://www.applebees.com/en");
	}*/
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	
	}
	
	@AfterTest(alwaysRun = true)
	public void cb() throws IOException, InterruptedException
	
	{
		//wait = new WebDriverWait(driver,3);
		//.driverwait.withTimeout(timeout)
		
		Thread.sleep(2000);
		driver.close();
		log.info("browser closed");
		System.out.println("Hi11");
		
	}
	
public static String getSS(String result) throws IOException
	{
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
String destination = "./SS/"+result+"screenshot.png";
File dest = new File(destination);
FileHandler.copy(src,dest);
return destination;

	
	} 

}
