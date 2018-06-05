package Stepdefs;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.google.common.io.Files;
import com.test.automation.config.FileReaderManager;
import com.test.automation.config.WebDriverManager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

	
	public class Hooks {		
		
		WebDriverManager webDriverManager;
		public static WebDriver driver;
		
		
		@Before
	    public void beforeScenario(){
			
	        System.out.println("This will run before the Scenario");
	        Reporter.assignAuthor("Raghu Chekuri");
		    webDriverManager = new WebDriverManager();
			driver = webDriverManager.getDriver();
			driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	    }	
		
					
		@After(order = 2)
		public void afterScenario(Scenario scenario) {
			//if (scenario.isFailed()) {
				String screenshotName = scenario.getName().replaceAll(" ", "_");
				try {
					//This takes a screenshot from the driver at save it to the specified location
					File sourcePath = ((TakesScreenshot)webDriverManager.getDriver()).getScreenshotAs(OutputType.FILE);
					
					//Building up the destination path for the screenshot to save
					//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
					Date date = new Date() ;
				    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy-EEE HH-mm-ss");
				    		
					File destinationPath = new File(System.getProperty("user.dir") + "/Reports/screenshots/" + screenshotName+dateFormat.format(date)+".jpeg");
					
					//Copy taken screenshot from source location to destination location
					Files.copy(sourcePath, destinationPath);   

					//This attach the specified screenshot to the test
					Reporter.addScreenCaptureFromPath(destinationPath.toString());
				} catch (IOException e) {
				} 
			//}
		}
		
		@After(order = 1)
		public static void writeExtentReport() {	
			
			
			Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
			Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		    Reporter.setSystemInfo("Machine", 	"Windows 7 " + "64 Bit");
		    Reporter.setSystemInfo("Selenium", "3.12.0");
		    Reporter.setSystemInfo("Maven", "4.0.0");
		    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		
		}
		
		@After(order = 0)
	    public void afterScenario(){
	        System.out.println("This will run after the Scenario");
	        webDriverManager.closeDriver();
	    }
		
		
	}

