package com.edaixi.wuliu;

import com.thoughtworks.selenium.*;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import java.util.regex.Pattern;

public class jiagongdianjiesuan_balanceend extends SeleneseTestNgHelper {
	@Test public void testJiagongdianjiesuan_balanceend() throws Exception {
		selenium.open("/map_cities/1/outlets/jiagongdian");
		selenium.click("link=城市列表");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=加工店管理");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=新建加工店");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=outlet_form_title", "testjiagongdian");
		selenium.type("id=outlet_form_tel", "18701112200");
		selenium.type("id=outlet_form_usertel", "测试张三");
		selenium.select("id=outlet_form_area", "label=朝阳区");
		selenium.type("id=outlet_form_address", "朝阳区酒仙桥");
		selenium.click("id=get_pos");
		selenium.click("id=get_pos");
		selenium.type("id=outlet_form_total", "10");
		selenium.click("id=outlet_form_end_date");
		selenium.click("link=6");
		selenium.click("id=outlet_form_can_xiyi");
		selenium.click("id=outlet_form_can_xixie");
		selenium.click("id=outlet_form_can_luxury");
		selenium.click("name=commit");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=编辑");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=outlet_form_usertel", "测试张三update");
		selenium.click("name=commit");
		selenium.waitForPageToLoad("30000");
	}
}
