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
			File file = new File("src\\test\\java\\Testdata\\gmaillogin.json");
		    String content = FileUtils.readFileToString(file, "utf-8");		    
		    JSONObject JsonObject = new JSONObject(content);		   
			
		    String password  = JsonObject.getString("password");			
			
			pwd.sendKeys(password);
		}
		
		public void clickNext()
		{
			passwordNext.click();
		}
		

}
