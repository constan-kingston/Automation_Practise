package com.automation.practice;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;

public class Automation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Workstuff\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximized");
		options.addArguments("ignore-certificate-errors");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://automationpractice.com/index.php");
		
		//Register on the website
		
		WebElement signin = driver.findElement(By.className("login"));
		signin.click();
		WebElement enterEmail = driver.findElement(By.id("email_create"));
		
		Random random = new Random();
		
		String ran = String.valueOf(random.nextInt(999));
		
		String email = "test"+ran+"new@abc.com";
		
		enterEmail.sendKeys(email);
		WebElement createAcc =  driver.findElement(By.xpath("//i[@class='icon-user left']"));
		createAcc.click();
		
		WebElement alertDanger = driver.findElement(By.id("create_account_error"));
		
		if(alertDanger.isDisplayed())
		{
			enterEmail.sendKeys("testagain"+ran+"new@abc.com");
		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		
		//WebElement title = driver.findElement(By.id("uniform-id_gender1"));
		
		WebElement fname = driver.findElement(By.id("customer_firstname"));
		
		
		WebElement lname = driver.findElement(By.id("customer_lastname"));
		WebElement passwd = driver.findElement(By.id("passwd"));
		WebElement dateOB = driver.findElement(By.id("uniform-days"));
		WebElement monOB = driver.findElement(By.id("months"));
		WebElement yearOB = driver.findElement(By.id("years"));
		WebElement company = driver.findElement(By.id("company"));
		WebElement addr1 = driver.findElement(By.id("address1"));
		WebElement addr2 = driver.findElement(By.id("address2"));
		WebElement city = driver.findElement(By.id("city"));
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		WebElement postcode = driver.findElement(By.id("postcode"));
		WebElement country = driver.findElement(By.id("uniform-id_country"));
		WebElement addlinfo = driver.findElement(By.id("other"));
		WebElement phone = driver.findElement(By.id("phone"));
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		WebElement aliasaddr = driver.findElement(By.id("alias"));
		WebElement register =  driver.findElement(By.id("submitAccount"));
		
		//WebElement alert = driver.findElement(By.xpath("//div[@class='alert alert-danger']"));
		
		//title.click();
		String finame = "myfname";
		String laname = "mylname";
		fname.sendKeys("finame");
		lname.sendKeys("laname");
		String pword = "87584";
		passwd.sendKeys(pword);
		
//		Select select = new Select(dateOB);
//		select.selectByValue("7");
//		Select select1 = new Select(monOB);
//		select.selectByValue("7");
//		Select select2 = new Select(yearOB);
//		select.selectByValue("1998");
		
		company.sendKeys("mycompany");
		addr1.sendKeys("myaddr1");
		addr2.sendKeys("myaddr2");
		city.sendKeys("mycity");
		
		Select select3 = new Select(state);
		select3.selectByValue("7");
		
		postcode.sendKeys("12345");
		
//		Select select4 = new Select(country);
//		select4.selectByVisibleText("Arizona");
		
		addlinfo.sendKeys("additional info");
		phone.sendKeys(String.valueOf(random.nextInt(99999999)));
		mobile.sendKeys(String.valueOf(random.nextInt(99999999)));
		
		aliasaddr.sendKeys("myaliasaddd");
		
		Thread.sleep(2000);
		
		register.click();
		
		 WebElement username = driver.findElement(By.cssSelector("a[href='http://automationpractice.com/index.php?controller=my-account']"));
		
		String loginName = username.getText();
		
		System.out.println("Login name: "+loginName);
		
		WebElement logout = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?mylogout=']"));
		logout.click();
		
		WebElement enterLEmail = driver.findElement(By.id("email"));
		enterLEmail.sendKeys(email);
		WebElement enterLpword = driver.findElement(By.id("passwd"));
		enterLpword.sendKeys(pword);
		WebElement buttonSubmit = driver.findElement(By.id("SubmitLogin"));
		buttonSubmit.click();
		
		WebElement women = driver.findElement(By.xpath("//a[@href='http://automationpractice.com/index.php?id_category=3&controller=category']"));
		Thread.sleep(2000);
		women.click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		
		Actions action = new Actions(driver);
		
		WebElement items = driver.findElement(By.xpath("//a[@title='Faded Short Sleeve T-shirts']"));
		String selectDress = items.getText();
		
		action.moveToElement(items).moveToElement(driver.findElement(By.xpath("//a[@class='button ajax_add_to_cart_button btn btn-default']")))
		.click().build().perform();
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		js.executeScript("window.scrollBy(0,650)", "");
		WebElement chkout = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));		
		Thread.sleep(2000);
		chkout.click();
		
		WebElement chkaddr = driver.findElement(By.name("processAddress"));
		js.executeScript("window.scrollBy(0,400)", "");
		chkaddr.click();
		
		WebElement chkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		js.executeScript("window.scrollBy(0,100)", "");
		chkbox.click();
		
		WebElement ship = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		ship.click();
		
		WebElement prodname = driver.findElement(By.xpath("//p[@class='product-name']"));
		String productname = prodname.getText();
		System.out.println(productname);
		
		
	}
	

}
