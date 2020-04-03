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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;


public class Base {
	
	public static WebDriver driver;
	public  Properties prop;
	public String url;
	//private File Null;
	//public File Null;
	//public File src;
	
	//source=null;
	
	public static Logger log= LogManager.getLogger(Base.class.getName());
	//@Test
	
	public WebDriver startbrowser() throws IOException
	{
	
	prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\sathish\\MT\\src\\main\\java\\resources\\data.properties");
	prop.load(fis);
	
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
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	return driver;
	
	}
	
/*public void getSS(String result) throws IOException
	{
src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(src,new File("./SS/"+result+"screenshot.png"));
	//return result;
	
	} */
}
