import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Newlufthansa {

@Given("^I open Lufthansa url$")
public void I_open_Lufthansa_url() throws Throwable {
    // Express the Regexp above with the code you wish you had
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.lufthansa.com/online/portal/lh/ua/homepage");
    throw new PendingException();
   
}

@Then("^I can see the values into drop down$")
public void I_can_see_the_values_into_drop_down() throws Throwable {
    // Express the Regexp above with the code you wish you had
    throw new PendingException();
}

}
