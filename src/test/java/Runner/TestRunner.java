package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriverException;

import com.cucumber.listener.Reporter;
import com.test.automation.config.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Features",
		glue = {"Stepdefs"},
		//format= {"pretty","html:src\\main\\java\\com\\test\\automation\\reports"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:Reports\\report.html"},		
		tags = { "@SmokeTests" }
		//monochrome = true
		//strict = false,
		//dryRun = false
		)

public class TestRunner {	
	    
	    
	 
	

}
