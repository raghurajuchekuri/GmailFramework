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
		
        lp.fillpwd();
        Thread.sleep(2000);
		lp.clickNext(); 
		Thread.sleep(2000);
	
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
