package Runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.test.automation.config.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\main\\java\\Features\\Sample.feature",
		glue = {"Stepdefs"},
		//format= {"pretty","html:src\\main\\java\\com\\test\\automation\\reports"},
		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:src\\main\\java\\com\\test\\automation\\reports\\report.html"},
		tags = { "@SmokeTests,@UATTests" }
		
		//monochrome = true
		)

public class TestRunner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
	    Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
	    Reporter.setSystemInfo("Machine", 	"Windows 7 " + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.12.0");
	    Reporter.setSystemInfo("Maven", "4.0.0");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
	

}
