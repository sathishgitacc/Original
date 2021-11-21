package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepdef {
	@Given("^Start browser$")
    public void Start_browser() throws Throwable {
		System.out.println("hi");
        
    }
	
	@When("^user click$")
	 public void user_click()
	 {
		System.out.println("hi");
	 }
	
@Then("^user is logged$")
public void user_is_logged()
{
	System.out.println("hi");
}


@When("^user click \"([^\"]*)\" in \"([^\"]*)\"$")
public void user_click_something_in_something(String strArg1, String strArg2) 
{
	System.out.println(strArg1 +  " " + strArg2);
	
}
@And("^Report Steps$")
public void report_Steps() {
	System.out.println("hi");
   
}

}
