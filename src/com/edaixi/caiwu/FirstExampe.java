/**
 * 
 */
package com.edaixi.caiwu;

/**
 * @author edaixicuijun
 *
 */
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.firefox.FirefoxDriver;  
  
  
public class FirstExampe {  
  
      
    public static void main(String[] args) {  
        WebDriver driver = new FirefoxDriver();  
  
         
        driver.get("http://www.google.com.hk");  
        WebElement element = driver.findElement(By.name("q"));  
        element.sendKeys("hello Selenium!");  
        element.submit();  
        try {  
            Thread.sleep(3000);  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
        System.out.println("Page title is: " + driver.getTitle());  
       
        driver.quit();  
    }  
}
