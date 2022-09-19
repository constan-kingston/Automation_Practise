package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import hooks.RootClass;
import pageObject.SignOn;
import utility.utility;

public class SD_SignOn extends RootClass {
	
	SignOn sg = new SignOn();
	
	@Given("^I enter the url in the webpage\"([^\"]*)\"$")
    public void i_enter_the_url_in_the_webpagesomething(String url) throws Throwable {
		
		driver.get(url);
		utility.screenshot();
        
    }

    @When("^I enter email id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_email_id_something_and_password_something(String email, String password) throws Throwable {
    	
    	sg.enterLoginDet(email, password);
        
    }

    @And("^I verify the signon name \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_verify_the_signon_name_something_and_something(String fname, String lname) throws Throwable {
    	
    	sg.verifyLogin(fname, lname);
       
    }


}
