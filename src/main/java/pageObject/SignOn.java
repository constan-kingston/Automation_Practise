package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.RootClass;
import utility.utility;

public class SignOn extends RootClass{
	
	@FindBy(how=How.XPATH,using="//a[@class='login']")
	private static WebElement signin;
	
	@FindBy(how = How.ID, using = "email") 
	private static WebElement emailID;
	
	@FindBy(how = How.ID, using = "passwd") 
	private static WebElement password;
	
	@FindBy(how = How.ID, using = "SubmitLogin") 
	private static WebElement submitbtn;
	
	@FindBy(how=How.XPATH,using="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	private static WebElement username;
	
	public SignOn()
	{
		PageFactory.initElements(driver, this);
	}
	
	utility ut = new utility();

	public void enterLoginDet(String email, String password2) {
		
		ut.click(signin);
		utility.screenshot();
		ut.setText(emailID, email);
		ut.setText(password, password2);
		utility.screenshot();
		ut.click(submitbtn);
		utility.screenshot();
	}

	public void verifyLogin(String fname, String lname) {
		
		String input = fname +" "+lname;
		
		String loginName = ut.getText(username);
		
		System.out.println("Input Name "+input);
		System.out.println("Login Name "+loginName);
		
		if(input.equalsIgnoreCase(loginName))
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("Condition failed");
			Assert.assertTrue(false);
		}
		
	}

}
