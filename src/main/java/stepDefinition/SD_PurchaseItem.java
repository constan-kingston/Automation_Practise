package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.RootClass;
import pageObject.PurchaseItem;
import utility.utility;

public class SD_PurchaseItem extends RootClass {
	
	PurchaseItem pi = new PurchaseItem();

    @Given("^I enter the website url in the webpage\"([^\"]*)\"$")
    public void i_enter_the_website_url_in_the_webpagesomething(String url) throws Throwable {
    	
    	driver.get(url);
    	utility.screenshot();
    }

    @When("^I enter the website email id \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void i_enter_the_website_email_id_something_and_password_something(String email, String password) throws Throwable {
    	
    	pi.enterLogDet(email,password);
    }

    
    @And("^I add item to the cart$")
    public void i_add_item_to_the_cart() throws Throwable {
    	
    	pi.addProd();
        
    }

    @And("^I navigate to purchase page$")
    public void i_navigate_to_purchase_page() throws Throwable {
    	
    	pi.checkOut();
        
    }

    @Then("^I verify the added product$")
    public void i_verify_the_added_product() throws Throwable {
    	
    	pi.prodName();
        
    }

   

}
