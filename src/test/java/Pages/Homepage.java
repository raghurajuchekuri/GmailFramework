package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	//Location of elements
	
	public WebDriver driver;
	
	@FindBy(name="identifier")
	public WebElement uid;	
	
	@FindBy(id="identifierNext")
	public WebElement uidNext;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void filluid() throws Throwable
	{
		File file = new File("src\\test\\java\\Testdata\\gmaillogin.json");
	    String content = FileUtils.readFileToString(file, "utf-8");		    
	    JSONObject JsonObject = new JSONObject(content); 
		String loginid = JsonObject.getString("loginid");
		System.out.println(loginid);
		uid.sendKeys(loginid);
	}
	
	public void clickNext()
	{
		uidNext.click();
	}
	

}
