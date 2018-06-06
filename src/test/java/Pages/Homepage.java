package Pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusablecode.JsonReaders;

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
		System.out.println(JsonReaders.gmailjsondata().get(0));
		uid.sendKeys(JsonReaders.gmailjsondata().get(0));
	}
	
	public void clickNext()
	{
		uidNext.click();
	}
	

}
