package com.edaixi.caiwu;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class TQM403_TestCase {

	
	//http://stackoverflow.com/questions/18132018/handling-the-popup-window-in-selenium-webdriver-doesnt-work
	//http://blog.csdn.net/fangaoxin/article/details/6952954
	//http://justjavac.iteye.com/blog/714654
	static WebDriver driver;

	@BeforeClass
	public static void classSetUp() {

		System.setProperty("webdriver.firefox.bin","C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

		driver = Utils.setUp();
		driver.get("http://9.112.229.213:9000/PLCM/home");
	}

	@AfterClass
	public static void classTearDown() throws Exception {
		Utils.tearDown();
	}

/*	@Test
	public void run010() {
		Utils.captureBrowser("01.010.010.png");
	}
*/
//	@Test
//	public void run020() {
//
////		driver.findElement(By.name("UserName")).sendKeys("admin");
////		driver.findElement(By.name("password")).sendKeys("a");
//		driver.findElement(By.cssSelector("html#login body form div.login-bar div.login-transparent-border div.login-bar-inside div.editor-field input#UserName")).sendKeys("admin");
//		driver.findElement(By.cssSelector("html#login body form div.login-bar div.login-transparent-border div.login-bar-inside div.editor-field input#password")).sendKeys("a");
//		//driver.findElement(By.tagName("login")).click();
//		driver.findElement(By.cssSelector("html#login body form div.login-bar div.login-transparent-border div.login-bar-inside p.buttons input.blue-button")).click();
//
//		
//		
//		Utils.waitUntil(new ExpectedCondition<Boolean>() {
//			public Boolean apply(WebDriver d) {
//				WebElement errorIcon = d.findElement(By.cssSelector("html.k-ff.k-ff31 body#realBody"));
//				return errorIcon != null && errorIcon.isDisplayed();
//			}
//		});
//		//
//		Utils.captureBrowser("01.010.020.png");
//		
//
//		
//		
//		
//		
//	}
	
	
	@Test
	public void run030() {

//		driver.findElement(By.name("UserName")).sendKeys("admin");
//		driver.findElement(By.name("password")).sendKeys("a");
		driver.findElement(By.cssSelector("html#login body form div.login-bar div.login-transparent-border div.login-bar-inside div.editor-field input#UserName")).sendKeys("admin");
		driver.findElement(By.cssSelector("html#login body form div.login-bar div.login-transparent-border div.login-bar-inside div.editor-field input#password")).sendKeys("a");
		//driver.findElement(By.tagName("login")).click();
		driver.findElement(By.cssSelector("html#login body form div.login-bar div.login-transparent-border div.login-bar-inside p.buttons input.blue-button")).click();
		
		driver.findElement(By.cssSelector("#sidebarContainer li:nth-child(4)")).click();
		//driver.findElement(By.linkText("id('sidebarContainer_tv_active')/x:div/x:span")).click();
		
		
		Utils.waitUntil(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				WebElement errorIcon = d.findElement(By.cssSelector(".section table tbody tr td:nth-child(1)"));
				return errorIcon != null && errorIcon.isDisplayed();
			}
		});
		//
		Utils.captureBrowser("01.010.030.png");
		String currentWindow = driver.getWindowHandle();//获取当前窗口句柄
		
		System.out.println("driver windows name is "+driver.getTitle());
		driver.findElement(By.cssSelector(".searchItem")).click();
		//#sidebarContainer 
		
		Utils.waitUntil(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				WebElement errorIcon = d.findElement(By.cssSelector(".search-panel-buttons"));
				return errorIcon != null && errorIcon.isDisplayed();
			}
		});
		Utils.captureBrowser("01.010.040.png");
		//handleMultipleWindows(driver.getTitle());
		
		
		driver.switchTo().window(currentWindow);
		
		//System.out.print(driver.switchTo().window(currentWindow));
		//WebDriver driver = new InternetExplorerDriver();  
//	    By locator = By.id("id");  
//	    isElementExsit(driver,locator); 
	    //System.out.print(" driver switch new windows is ->"+driver.switchTo().alert());
		
	}  
	


}
