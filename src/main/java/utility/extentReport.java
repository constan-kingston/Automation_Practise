package utility;

import java.util.Properties;

public class extentReport {
	
	public String getReportConfigPath()
	
	{
		Properties p = new Properties();
		
		String reportConfigPath = p.getProperty("F:\\Automation Practice\\practice\\src\\test\\java\\config\\extent-config.xml");
		if(reportConfigPath != null) return reportConfigPath;
		else throw new RuntimeException("Report config path not specified");
	}

}
