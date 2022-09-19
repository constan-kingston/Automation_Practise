package utility;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import hooks.RootClass;

public class TestDriver extends RootClass {
	
	
	public WebDriver initialize() throws FileNotFoundException
	{
		String browser = utility.ReadProperty("Browser");
		
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Workstuff\\chromedriver_win32\\chromedriver.exe");
			
			ChromeOptions options = new ChromeOptions();

			options.addArguments("start-maximized");
			options.addArguments("ignore-certificate-errors");
			
			driver = new ChromeDriver(options);

		}
		return driver;
	}

}
