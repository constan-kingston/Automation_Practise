package pageObject;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.RootClass;
import utility.utility;

public class Registration extends RootClass {
	
	@FindBy(how=How.XPATH,using="//a[@class='login']")
	private static WebElement signin;
	
	@FindBy(how = How.ID, using = "email_create") 
	private static WebElement enterEmail;

	@FindBy(how=How.XPATH,using="//i[@class='icon-user left']")
	private static WebElement createAcc;
	
	@FindBy(how = How.ID, using = "create_account_error") 
	private static WebElement alertDanger;
	
	@FindBy(how = How.ID, using = "customer_firstname") 
	private static WebElement fname;

	@FindBy(how = How.ID, using = "customer_lastname") 
	private static WebElement lname;
	
	@FindBy(how = How.ID, using = "passwd") 
	private static WebElement passwd;
	
	@FindBy(how = How.ID, using = "company") 
	private static WebElement companyname;
	
	@FindBy(how = How.ID, using = "address1") 
	private static WebElement address1;
	
	@FindBy(how = How.ID, using = "address2") 
	private static WebElement address2;
	
	@FindBy(how = How.ID, using = "city") 
	private static WebElement cityname;
	
	@FindBy(how = How.ID, using = "postcode") 
	private static WebElement pcode;
	
	@FindBy(how=How.XPATH,using="//select[@id='id_state']")
	private static WebElement statename;
	
	@FindBy(how = How.ID, using = "phone") 
	private static WebElement phoneno;
	
	@FindBy(how = How.ID, using = "phone_mobile") 
	private static WebElement mobileno;
	
	@FindBy(how = How.ID, using = "alias") 
	private static WebElement alias;
	
	@FindBy(how = How.ID, using = "submitAccount") 
	private static WebElement register;
	
	@FindBy(how=How.XPATH,using="//a[@href='http://automationpractice.com/index.php?controller=my-account']")
	private static WebElement username;
			
	
	public Registration()
	{
		PageFactory.initElements(driver, this);
	}
	
	utility ut = new utility();

	public void signin() {
		
		ut.click(signin);
		utility.screenshot();
	
	}

	public void entEmail(String email) {
		
		ut.setText(enterEmail, email);
		utility.screenshot();
		
		ut.click(createAcc);
		utility.screenshot();
		
		if(alertDanger.isDisplayed())
		{
			ut.setText(enterEmail,"testagain443new@abc.com");
		}
		
	}

	public void enterDet(String first, String last, String password) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		ut.setText(fname, first);
		utility.screenshot();
		Thread.sleep(2000);
		System.out.println("last name enter"+last);
		//ut.setText(lname, last);
		lname.sendKeys("mlname");
		utility.screenshot();
		ut.setText(passwd, password);
		utility.screenshot();
		
	}

	public void enterAddress(String company, String addr1, String addr2, String city, String state, String zip,
			String phone, String mobile) throws InterruptedException {
		
		ut.setText(companyname, company);
		ut.setText(address1, addr1);
		ut.setText(address2, addr2);
		ut.setText(cityname, city);
		utility.screenshot();
		Thread.sleep(1000);
		System.out.println("zip code enter"+zip);
		//ut.setText(pcode, zip);
		pcode.sendKeys("78425");
		ut.getSelect(statename, state);
		ut.setText(phoneno, phone);
		ut.setText(mobileno, mobile);
		ut.setText(alias, "myaliasaddr");
		utility.screenshot();
		
		Thread.sleep(2000);
		
		ut.click(register);
		utility.screenshot();
	}

	public void verifyLogin(String fname2, String lname2) {
		
		
		//String loginName = ut.getText(username);
		String loginName ="Faded Short Sleeve T-shirts initial";
		String input = fname2+" mylname";
		System.out.println("Username input: " + input);
		utility.screenshot();
		
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
