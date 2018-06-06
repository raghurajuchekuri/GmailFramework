package Pages;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecode.JsonReaders;



public class LoginPage  {
	
	//Location of elements
	
	
	WebDriver driver;
		
		@FindBy(name="password")
		public WebElement pwd;	
		
		@FindBy(id="passwordNext")
		public WebElement passwordNext;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void fillpwd() throws Throwable 
		{
			
			pwd.sendKeys(JsonReaders.gmailjsondata().get(1));		
			
			
		}
		
		public void clickNext()
		{
			passwordNext.click();
		}
		

}
