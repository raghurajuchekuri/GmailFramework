package Stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.automation.config.FileReaderManager;
import com.test.automation.config.WebDriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class stepdefs {
	
	WebDriver driver;	
	WebDriverManager webDriverManager;
	
	@Given("^I am at page$")
	public void login() {
		/*System.out.println("hi Given");
		System.setProperty("webdriver.chrome.driver", FileReaderManager.getInstance().getConfigReader().getDriverPath());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());*/
		
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	    webDriverManager.closeDriver();
	
	}
	
	@Then("^I am at login$")
	public void login2() {
		System.out.println("hi Then");
		//Assert.assertEquals("a","b");
	
	}
	
	
	
	
	
	

}
