package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.BrowserSetup;
import hooks.RootClass;
import pageObject.Registration;
import utility.utility;

public class SD_RegisterUser extends RootClass {
	
	Registration rg = new Registration();
	
	@Given("^I enter the url in the webpage https://automationpractice\\.com/index\\.php$")
	public void i_enter_the_url_in_the_webpage_https_automationpractice_com_index_php() throws Throwable {
	   
		String url = utility.ReadProperty("URL");
		driver.get(url);
		utility.screenshot();
	}

	@When("^I click the signin buton$")
	public void i_click_the_signin_buton() throws Throwable {
	    
		rg.signin();
	}
	
	@Then("^I enter the (.+) id$")
    public void i_enter_the_id(String email) throws Throwable {
		rg.entEmail(email);
    }

	@Then("^I enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_the_and_and(String fname, String lname, String password) throws Throwable {
	   
		rg.enterDet(fname, lname, password);
	}
		
     
	@And("^I enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_the_something_and_something_and_something_and_something_and_something_and_something_and_something_and_something(String company, String addr1, String addr2, String city, String state, String zip, String phone, String mobile) throws Throwable {
     
		rg.enterAddress(company, addr1, addr2, city, state, zip, phone, mobile);
    }

	@Then("^I verify the signon Name \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_verify_the_signon_name_something_and_something(String fname, String lname) throws Throwable {
		
		rg.verifyLogin(fname,lname);
        
    }


}
