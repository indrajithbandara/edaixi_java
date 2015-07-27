package com.edaixi.utils;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utils {
	
	static String CHROME_DRIVER_PATH = "chromedriver.exe";
	//static String IMAGE_DIR = "C:\\Downloads\\RTC_TVT";
	static String IMAGE_DIR = "C:\\Users\\IBM_ADMIN\\Desktop\\ScreenCapture\\en";
	static int timeOutInSecs = 20;
	static String locale = "en";
	
	public static WebDriver driver = null;
	
	public static WebDriver setUp() {
		if (driver == null) {
			new File(IMAGE_DIR).mkdirs();
			
			// Chrome do these.
//			 System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
//			 driver = new ChromeDriver();
			
			// Firefox do these.
			 System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//			 FirefoxProfile profile = new FirefoxProfile();
			 File profileDir = new File("C:\\Program Files (x86)\\Mozilla Firefox");
			 FirefoxProfile profile = new FirefoxProfile(profileDir);
				
			 profile.setPreference("intl.accept_languages", locale);
			 driver = new FirefoxDriver(profile);
			 
			 driver.manage().timeouts().implicitlyWait(timeOutInSecs, TimeUnit.SECONDS);
		}
		
		return driver;

	}
	
	public static void tearDown() {
		driver.quit();
		driver = null;
		
	}
	
	public static void captureBrowser(String filename) {
		File capturedFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File targetFile = new File(IMAGE_DIR, filename);
		if (targetFile.exists() ) {
			targetFile.delete();
		}
		capturedFile.renameTo(targetFile);
	}
	
	public static void captureScreen(String filename) {
	    try {
		BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			ImageIO.write(image, "png", new File(IMAGE_DIR, filename));
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}
	
	
	public static void waitUntil(ExpectedCondition<Boolean> condition) {
		new WebDriverWait(driver, timeOutInSecs).until(condition);
	}


	public static void sleep(long millisecs) {
		try {
			Thread.sleep(millisecs);
		} catch (InterruptedException e) {}
	}
	
	
}
