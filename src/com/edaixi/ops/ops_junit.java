package com.edaixi.ops;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ops_junit {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://ops05.edaixi.cn:81/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testOpsJunit() throws Exception {
    driver.get(baseUrl + "/coupons?utf8=%E2%9C%93&title=%E4%BC%98%E6%83%A0%E5%88%B8%E6%B7%BB%E5%8A%A0&commit=%E6%9F%A5+%E8%AF%A2");
    driver.findElement(By.linkText("衣物管理")).click();
    driver.findElement(By.linkText("衣物管理")).click();
    driver.findElement(By.linkText("后端价格管理")).click();
    // ERROR: Caught exception [Error: locator strategy either id or name must be specified explicitly.]
    driver.findElement(By.linkText("衣物管理")).click();
    driver.findElement(By.linkText("历史价格管理")).click();
    new Select(driver.findElement(By.id("category_id"))).selectByVisibleText("洗衣");
    new Select(driver.findElement(By.id("city_id"))).selectByVisibleText("北京");
    driver.findElement(By.id("query_cloth_price")).click();
    driver.findElement(By.linkText("网页")).click();
    driver.findElement(By.id("kw")).click();
    driver.findElement(By.id("kw")).clear();
    driver.findElement(By.id("kw")).sendKeys("log4j");
    driver.findElement(By.id("su")).click();
    driver.findElement(By.id("kw")).click();
    driver.findElement(By.xpath("//form[@id='form']/span")).click();
    driver.findElement(By.id("kw")).click();
    driver.findElement(By.id("kw")).clear();
    driver.findElement(By.id("kw")).sendKeys("apache log4j");
    driver.findElement(By.id("su")).click();
    driver.findElement(By.linkText("Apache log4j 1.2 - Download Apache log4j 1.2")).click();
    driver.findElement(By.linkText("log4j-1.2.17.zip")).click();
    driver.findElement(By.xpath("//p[5]/a/strong")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
