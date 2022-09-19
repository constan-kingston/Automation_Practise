package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import hooks.RootClass;

public class utility extends RootClass {
	
	public static String  ReadProperty(String key) throws FileNotFoundException
	{
		Properties prop = new Properties();
		String filepath = "src//test//java//config//config.properties";
		FileInputStream fis = new FileInputStream(filepath);
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop.getProperty(key);
	}
	
	public void click(WebElement ele)
	{
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		ele.click();
	}
	
	public void setText(WebElement ele, String text)
	{
		ele.clear();
		ele.sendKeys(text);
		
	}
	
	public void getSelect(WebElement ele, String value)
	{
		Select select = new Select(ele);
		select.selectByValue("7");
	}
	
	public String getText(WebElement ele)
	{
		String text = ele.getText();
		return text;
	}
	

	public void Scroll(int y)
	{
		String scrollVal = "window.scrollBy(0,"+y+")\", \"\"";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(scrollVal);
	}
	
	public static void screenshot()
	{
		try {
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String imageName = System.currentTimeMillis()+".png";
			File destFile = new File("target/cucumber-reports/Screenshots/"+imageName);
			FileUtils.copyFile(srcFile, destFile);
					
		}
		catch(Exception e) {
			System.out.println("Screenshot Not Saved");
		}
		
	}
	
	public static void WriteProperty(String Key, String data, String fileName) throws FileNotFoundException, IOException
	{
		OutputStream out = null;
		Platform current = Platform.getCurrent();
		
		Properties prop = new Properties();
		
		File f = new File("src//test//java//config//"+fileName+".properties");
		if(f.exists())
		{
			prop.load(new FileReader(f));
			prop.setProperty(Key, data);
		}
		
		out =  new FileOutputStream(f);
		prop.store(out, "Property file updated");
		
		out.close();
		
	}
}
