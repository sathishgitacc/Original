package StepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import resources.Base;

public class HPTestCase extends Base {
	

	@Given("^browser \"([^\"]*)\" in \"([^\"]*)\"$")
    public void browser_something_in_something(String strArg1, String strArg2) 
	{
	
		if(strArg1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
	
		
		driver.get(strArg2);
       
    }

    @When("^user logged in$")
    public void user_logged_in() throws Throwable {
       
    }

    @And("^Place Order$")
    public void place_order() throws Throwable {
        
    }

}
