package Stepdefs;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.automation.config.FileReaderManager;
import com.test.automation.config.WebDriverManager;

import Pages.Composepage;
import Pages.Homepage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class stepdefs {
	
	//To initialize the driver to page factory classes
	WebDriver driver = Hooks.driver;	
		
	Homepage hp = new Homepage(driver);	
	LoginPage lp = new LoginPage(driver);
	Composepage cp=new Composepage(driver);
	 //cp.clickcompose();
	
	@Given("^I am at Login page$")
	public void login() throws Throwable {
		System.out.println("hi Given");	
		
		
		hp.filluid();
		hp.clickNext();
		
		Thread.sleep(2000);
		
        lp.fillpwd();		
		//lp.clickNext();   	
	    
	
	}
	
	@Then("^I am at login$")
	public void login2() {
		System.out.println("hi Then");
		//Assert.assertEquals("a","b");
	
	}
	
	
	
	
	
	
	

}
