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
import cucumber.api.java.en.When;
import reusablecode.JsonReaders;


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
		      
		}
	
	
	@When("^I enter valid uid and pwd$")
	public void validpwd() throws Throwable {
				
        lp.fillpwd(JsonReaders.gmailjsondata().get(1));
        Thread.sleep(2000);
		lp.clickNext(); 
		Thread.sleep(2000);
	
	}
	
	@When("^I enter invalid uid and pwd$")
	public void invalidpwd() throws Throwable {
				
        lp.fillpwd(JsonReaders.gmailjsondata().get(5));
        Thread.sleep(2000);
		lp.clickNext(); 
		Thread.sleep(2000);
	
	}
	
	
	
	@Then ("^Validate a error message$")
	public void pwdcheck() throws Throwable {
				
		String x=lp.pwderr();
		Assert.assertEquals(x,"Wrong password. Try again or click Forgot password to reset it.");
	
	}
	
	@Then("^I am at Compose page$")
	public void Compose() throws Throwable {
		
		//Assert.assertEquals("a","b");
		
		cp.clickcompose();
		Thread.sleep(2000);
		
		cp.fillto();
		
		
		cp.fillsubj();
		
		
		cp.fillbody();		
	
		
		cp.clicksend();			
		Thread.sleep(2000);
		
	}
	
	
	@Then("^I will Logout$")
	public void logout() throws Throwable {
		
		Thread.sleep(2000);
		cp.clickLogout();	
		Thread.sleep(2000);
		cp.clickLogout2();
	
	}
	
	
	
	

}
