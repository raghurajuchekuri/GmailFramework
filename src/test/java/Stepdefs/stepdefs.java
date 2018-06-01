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
	
	
	
	@Given("^I am at page$")
	public void login() {
		System.out.println("hi Given");	
	    
	
	}
	
	@Then("^I am at login$")
	public void login2() {
		System.out.println("hi Then");
		//Assert.assertEquals("a","b");
	
	}
	
	@Then("^I am at login2$")
	public void login3() {
		System.out.println("hi Then");
		//Assert.assertEquals("a","b");
	
	}
	
	
	@Then("^I am at login4$")
	public void login4() {
		System.out.println("hi Then");
		Assert.assertEquals("a","b");
	
	}
	
	
	

}
