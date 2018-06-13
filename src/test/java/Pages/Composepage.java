package Pages;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;

import reusablecode.JsonReaders;


public class Composepage {
	
			//Location of elements	
			public WebDriver driver;
						
			@FindBy(xpath="//*[text()='COMPOSE']")					public WebElement clickcompose;
			@FindBy(name="to") 										public WebElement to;
			@FindBy(name="subjectbox")								public WebElement subj;
			@FindBy(xpath="(//*[@aria-label=\"Message Body\"])[2]") public WebElement body;
			@FindBy(xpath="//*[@aria-label=\"Attach files\"]")		public WebElement attach;	
			@FindBy(xpath="(//*[contains(text(),'Send')])[1]")		public WebElement send;				
			
			@FindBy(xpath="//*[contains(@title, 'Google Account: RaghuRaju Chekuri')]")	
			public WebElement logout1;				
			
			@FindBy(id="gb_71")										public WebElement logout2;		
									
			public Composepage(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);
			}	
			
							
			
			public void clickcompose()
			{
				clickcompose.click();				
				//System.out.println(clickcompose.getText());
				Assert.assertEquals("COMPOSE",clickcompose.getText());
				//Reporter.addStepLog("Failed");
				
			}
			
			public void fillto() throws Throwable
			{
				
				to.sendKeys(JsonReaders.gmailjsondata().get(2));
			}
			
			public void fillsubj() throws Throwable
			{
				subj.sendKeys(JsonReaders.gmailjsondata().get(3));
											
			}
			
			public void fillbody() throws Throwable
			{
				body.sendKeys(JsonReaders.gmailjsondata().get(4));							
				
			}
				
			public void addattach() throws Throwable
			{
				attach.click();	
				
				Thread.sleep(2000);
				
				 //StringSelection ss = new StringSelection("D:\\Java_EclipseO2\\SeleniumPractice\\Screenshots\\05-Mar-2018-Mon 10-40-14.png");
				 StringSelection ss = new StringSelection("C:\\Users\\rchekuri\\Desktop\\New folder (2)\\New folder (2).7z");  
				 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

				    //imitate mouse events like ENTER, CTRL+C, CTRL+V
				    Robot robot = new Robot();
				    Thread.sleep(2000);
				    robot.keyPress(KeyEvent.VK_ENTER);
				    robot.keyRelease(KeyEvent.VK_ENTER);
				    robot.keyPress(KeyEvent.VK_CONTROL);
				    robot.keyPress(KeyEvent.VK_V);
				    robot.keyRelease(KeyEvent.VK_CONTROL);
				    robot.keyRelease(KeyEvent.VK_V);
				    Thread.sleep(2000);
				    robot.keyPress(KeyEvent.VK_ENTER);
				    robot.keyRelease(KeyEvent.VK_ENTER);
				    //Thread.sleep(2000);
				    
				    WebDriverWait w = new WebDriverWait (driver,1000);				    
				    w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@role='progressbar']"))));				    
				    w.until(ExpectedConditions.invisibilityOfElementLocated((By.xpath("//*[@role='progressbar']"))));
				    
				
			}
			
						
			public void clicksend()
			{
				send.click();
			}
			
			
			public void clickLogout()
			{
				logout1.click();
			}

			public void clickLogout2()
			{
				logout2.click();
			}
			
			public void driverClose()
			{
				driver.close();
			}
}
