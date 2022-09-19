package testRunner;

import java.io.File;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\features"
		
		,glue={"stepDefinition", "hooks"},
		
		tags= {"@myAutomationPractice"},
		
		plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
		},
		
		dryRun = false, monochrome = true
		)
public class TestRunner {
	
	public static void setup()
	{
		Reporter.loadXMLConfig(new File("src/test/java/extent-config.xml"));
		Reporter.setSystemInfo("Application Name", "Shopping Website");
		Reporter.setSystemInfo("OS Type", System.getProperty("os.name").toString());
		Reporter.setTestRunnerOutput("Test Execution Report");
	}

}
