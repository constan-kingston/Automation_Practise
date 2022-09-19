package hooks;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import utility.TestDriver;
import utility.utility;

public class BrowserSetup extends RootClass {
	
	static File file;
	public static String ReportName = "Start";
	public static BufferedWriter bw;
	public static FileWriter fw;
	public static Boolean falg =true;
	public static Boolean falgtable =true;
	public static int totalcount;
	public static int Passcount=0;
	public static int Failedcount=0;
	public static Boolean faileScenario =true;
	public static String ScenarioName="First";
	
	
	TestDriver testDriver = new TestDriver();
	
	@Before
	public void setup() throws FileNotFoundException
	{

		driver = testDriver.initialize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("INITALIZE DRIVER");
	}
	
	@After
	public static void reportSetupScreenshot(Scenario scenario) throws FileNotFoundException, IOException
	{
		Collection<String> scenarioTags = scenario.getSourceTagNames();
		String tags = scenarioTags.toString().replaceAll("[@,]", "").replace("[", "");
		String currentTags[] = tags.split(" ");
		String currentTag = currentTags[0];
		
		SimpleDateFormat format = new SimpleDateFormat("ddMMyyyy - HHMM");
		Date date = new Date();
		String todayDate = format.format(date);
		
		String reportname =  currentTag+" "+todayDate;
		utility.WriteProperty("lastScenarioName", reportname, "fileRename");
		
		System.err.println(currentTag);
		System.err.println(scenario.getName());
		
		if(scenario.isFailed())
		{
			Failedcount++;
			totalcount++;
			
			Stepreport(currentTag,scenario.getName(),"PASS","");
		}
	}
	
	private static void Stepreport(String tag, String scenarioName, String status, String path) throws IOException {
		
		file = new File("target//cucumber-html-report/CustomerReport.html");
		fw=new FileWriter(file,true);
		bw=new BufferedWriter(fw);
		
		try
		{
			try
			{
				if(bw != null)
					bw.close();
				
				if(fw != null)
					fw.close();
			} catch(IOException ex)
			{
				ex.printStackTrace();
			}
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			
			bw.write("<tr>");
			bw.write("<td>"+tag+"</td>");
			bw.write("<td>"+scenarioName+"</td>");
			if(status.equalsIgnoreCase("pass"))
				bw.write("<td><a href=\""+path+"\"><font color=\"green\">"+status+"</font></a></td>");
			else
				bw.write("<td><a href=\""+path+"\"><font color=\"red\">"+status+"</font></a></td>");
				bw.write("</tr>");
				
				try {
					if(bw != null)
						bw.close();
					
					if(fw != null)
						fw.close();
				} catch (IOException ex)
				{
					ex.printStackTrace();
				}
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	@After
	public void tearDown(Scenario scenario)
	{
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			
			if(scenario.isFailed())
			{
				TakesScreenshot ts =  (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot,"image/png");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		driver.close();
	}
	
//	@After
//	public void tearDown() throws Exception {
//
//	    driver.quit();
//	}

}
