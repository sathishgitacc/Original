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
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("Hi");
		driver.findElement(By.cssSelector("input[value*='Log']")).click(); //Css selector Regular Expression
		driver.findElement(By.xpath("//input[contains(@name,'emai')]")).sendKeys("Hi"); //Xpath Regular Expression
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Hi");
	

	}
}

