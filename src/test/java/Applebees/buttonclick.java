package Applebees;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class buttonclick {
	
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.applebees.com/en/menu/build-your-sampler/build-your-sampler-choose-2");
		driver.findElement(By.xpath("//li[@menuitemid='205371395']/div[2]/p")).click();

	}

}
