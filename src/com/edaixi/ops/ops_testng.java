package com.edaixi.ops;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class ops_testng extends SeleneseTestNgHelper {
	
	@Test public void testOps_testng() throws Exception {
		selenium.open("/coupons?utf8=%E2%9C%93&title=%E4%BC%98%E6%83%A0%E5%88%B8%E6%B7%BB%E5%8A%A0&commit=%E6%9F%A5+%E8%AF%A2");
		selenium.click("link=衣物管理");
		selenium.click("link=衣物管理");
		selenium.click("link=后端价格管理");
		selenium.click("LOCATOR_DETECTION_FAILED");
		selenium.click("link=衣物管理");
		selenium.click("link=历史价格管理");
		selenium.select("id=category_id", "label=洗衣");
		selenium.select("id=city_id", "label=北京");
		selenium.click("id=query_cloth_price");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=网页");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=kw");
		selenium.type("id=kw", "log4j");
		selenium.click("id=su");
		selenium.click("id=kw");
		selenium.click("//form[@id='form']/span");
		selenium.click("id=kw");
		selenium.type("id=kw", "apache log4j");
		selenium.click("id=su");
		selenium.click("link=Apache log4j 1.2 - Download Apache log4j 1.2");
		selenium.click("link=log4j-1.2.17.zip");
		selenium.waitForPageToLoad("30000");
		selenium.click("//p[5]/a/strong");
		selenium.waitForPageToLoad("30000");
	}
}
