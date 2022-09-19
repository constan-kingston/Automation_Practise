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
	
//	@Given("^I enter the url in the webpage https://automationpractice\\.com/index\\.php$")
//	public void i_enter_the_url_in_the_webpage_https_automationpractice_com_index_php() throws Throwable {
//	   
//		String url = utility.ReadProperty("URL");
//		driver.get(url);
//		utility.screenshot();
//	}
//
//	@When("^I click the signin buton$")
//	public void si_click_the_signin_buton() throws Throwable {
//	    
//		rg.signin();
//	}
//	
//	@Then("^I enter the (.+) id$")
//    public void i_enter_the_id(String email) throws Throwable {
//		rg.entEmail(email);
//    }
//
//	@Then("^I enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void i_enter_the_and_and(String fname, String lname, String password) throws Throwable {
//	   
//		rg.enterDet(fname, lname, password);
//	}
//		
//     
//	@And("^I enter the \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void i_enter_the_something_and_something_and_something_and_something_and_something_and_something_and_something_and_something(String company, String addr1, String addr2, String city, String state, String zip, String phone, String mobile) throws Throwable {
//     
//		rg.enterAddress(company, addr1, addr2, city, state, zip, phone, mobile);
//    }
//
//	@Then("^I verify the signon Name \"([^\"]*)\" and \"([^\"]*)\"$")
//    public void si_verify_the_signon_name_something_and_something(String fname, String lname) throws Throwable {
//		
//		
//        
//    }
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Given("^I enter the url in the automationpractise \"([^\"]*)\"$")
    public void i_enter_the_url_in_the_automationpractise_something(String url) throws Throwable {
		 
		String urls = utility.ReadProperty("URL");
			driver.get(urls);
			utility.screenshot();
	    }
    

    @When("^I click the signin buton$")
    public void i_click_the_signin_buton() throws Throwable {
    	
//    	String urls = utility.ReadProperty("URL");
//		driver.get(urls);
//		utility.screenshot();
    	rg.signin();
        
    }

    @Then("^I enter the email \"([^\"]*)\" id$")
    public void i_enter_the_email_something_id(String email) throws Throwable {
        
    	rg.entEmail(email);
    }


    @And("^I enter the firstname \"([^\"]*)\" and lastname \"([^\"]*)\" and passoword \"([^\"]*)\"$")
    public void i_enter_the_firstname_something_and_lastname_something_and_passoword_something(String fname, String lname, String password) throws Throwable {
        
    	rg.enterDet(fname, lname, password);
    }

    @And("^I enter the company \"([^\"]*)\" addr1 \"([^\"]*)\" addr2 \"([^\"]*)\" city \"([^\"]*)\" st \"([^\"]*)\" zip \"([^\"]*)\" phone \"([^\"]*)\" mobile \"([^\"]*)\"$")
    public void i_enter_the_company_something_addr1_something_addr2_something_city_something_st_something_zip_something_phone_something_mobile_something(String company, String addr1, String addr2, String city, String state, String pcode, String phone, String mobile) throws Throwable {
        
    	rg.enterAddress(company, addr1, addr2, city, state, pcode, phone, mobile);
    }
    

    @Then("^I verify the signon Name \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_verify_the_signon_name_something_and_something(String fname, String lname) throws Throwable {
    	
    	rg.verifyLogin(fname,lname);
        
    }

}
