package Stepdefs;

import com.test.automation.config.WebDriverManager;

import Pages.PageObjectManager;

public class TestContext {
	
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	
	
	public TestContext(){
		webDriverManager = new WebDriverManager();
		//pageObjectManager = new PageObjectManager(webDriverManager.getDriver());		
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
