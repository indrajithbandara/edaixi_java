package com.edaixi.wuliu;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class JiagongdianjiesuanBalanceendjunit {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://wuliu04.edaixi.cn:81/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testJiagongdianjiesuanBalanceendjunit() throws Exception {
    driver.get(baseUrl + "/map_cities/1/outlets/jiagongdian");
    driver.findElement(By.linkText("城市列表")).click();
    driver.findElement(By.linkText("加工店管理")).click();
    driver.findElement(By.linkText("新建加工店")).click();
    driver.findElement(By.id("outlet_form_title")).clear();
    driver.findElement(By.id("outlet_form_title")).sendKeys("testjiagongdian");
    driver.findElement(By.id("outlet_form_tel")).clear();
    driver.findElement(By.id("outlet_form_tel")).sendKeys("18701112200");
    driver.findElement(By.id("outlet_form_usertel")).clear();
    driver.findElement(By.id("outlet_form_usertel")).sendKeys("测试张三");
    new Select(driver.findElement(By.id("outlet_form_area"))).selectByVisibleText("朝阳区");
    driver.findElement(By.id("outlet_form_address")).clear();
    driver.findElement(By.id("outlet_form_address")).sendKeys("朝阳区酒仙桥");
    driver.findElement(By.id("get_pos")).click();
    driver.findElement(By.id("get_pos")).click();
    driver.findElement(By.id("outlet_form_total")).clear();
    driver.findElement(By.id("outlet_form_total")).sendKeys("10");
    driver.findElement(By.id("outlet_form_end_date")).click();
    driver.findElement(By.linkText("6")).click();
    driver.findElement(By.id("outlet_form_can_xiyi")).click();
    driver.findElement(By.id("outlet_form_can_xixie")).click();
    driver.findElement(By.id("outlet_form_can_luxury")).click();
    driver.findElement(By.name("commit")).click();
    driver.findElement(By.linkText("编辑")).click();
    driver.findElement(By.id("outlet_form_usertel")).clear();
    driver.findElement(By.id("outlet_form_usertel")).sendKeys("测试张三update");
    driver.findElement(By.name("commit")).click();
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
