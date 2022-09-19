package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.RootClass;
import utility.utility;

public class PurchaseItem extends RootClass {
	
	@FindBy(how=How.XPATH,using="//a[@class='login']")
	private static WebElement signin;
	
	@FindBy(how = How.ID, using = "email") 
	private static WebElement emailID;
	
	@FindBy(how = How.ID, using = "passwd") 
	private static WebElement password;
	
	@FindBy(how = How.ID, using = "SubmitLogin") 
	private static WebElement submitbtn;
	
	@FindBy(how=How.XPATH,using="//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']")
	private static WebElement women;
	
	@FindBy(how=How.XPATH,using="//a[@class='button btn btn-default standard-checkout button-medium']")
	private static WebElement chkout;
	
	@FindBy(how = How.NAME, using="processAddress") 
	private static WebElement chkaddr;
	
	@FindBy(how=How.XPATH,using="//input[@type='checkbox']")
	private static WebElement chkbox;
	
	@FindBy(how=How.XPATH,using="//button[@name='processCarrier']")
	private static WebElement ship;
	
	@FindBy(how=How.XPATH,using="//p[@class='product-name']")
	private static WebElement prodname;
	
	@FindBy(how = How.ID, using = "layer_cart_product_title") 
	private static WebElement itemName;
	
	
	utility ut = new utility();
	String selectDress;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	public PurchaseItem()
	{
		PageFactory.initElements(driver, this);
	}

	public void enterLogDet(String email, String pword) {
		
		
		ut.click(signin);
		utility.screenshot();
		ut.setText(emailID, email);
		ut.setText(password, pword);
		utility.screenshot();
		ut.click(submitbtn);
		utility.screenshot();
	}

	public void addProd() throws InterruptedException {
		
		ut.click(women);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		Actions action = new Actions(driver);
		
		WebElement items = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		
		action.moveToElement(items).moveToElement(driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")))
		.click().build().perform();
		utility.screenshot();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		utility.screenshot();
		selectDress = ut.getText(itemName);
		System.out.println("input dress: "+selectDress);
	}

	public void checkOut() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,650)", "");;
		Thread.sleep(2000);
		utility.screenshot();
		ut.click(chkout);
		
		js.executeScript("window.scrollBy(0,400)", "");
		ut.click(chkaddr);
		
		js.executeScript("window.scrollBy(0,100)", "");
		ut.click(chkbox);
		utility.screenshot();
		ut.click(ship);
		utility.screenshot();
	}

	public void prodName() {
		
		String productName  = ut.getText(prodname);
		
		System.out.println("final: "+productName +" initial: "+selectDress);
		
		if(selectDress.equalsIgnoreCase(productName))
		{
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("cond failed");
			
			Assert.assertTrue(false);
		}
	}

}
