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
		
		@FindBy(xpath="//*[contains(text(),'Wrong password. Try again or click Forgot password to reset it.')]")
		public WebElement pwderr;
		
		public LoginPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		/*public void fillpwd() throws Throwable 
		{			
			pwd.sendKeys(JsonReaders.gmailjsondata().get(1));			
			
		}*/
		
		public void fillpwd(String validpwd) throws Throwable 
		{			
			pwd.sendKeys(validpwd);			
			
		}
		
		public void fillinvalidpwd(String invalidpwd) throws Throwable 
		{			
			pwd.sendKeys(invalidpwd);			
			
		}
		
		public void clickNext()
		{
			passwordNext.click();
		}
		
		public String pwderr()
		{
			return pwderr.getText();
		}
		
		

}
