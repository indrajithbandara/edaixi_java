package com.edaixi.caiwu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Order {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.ie.driver","C:\\Users\\yren9\\workspace\\selenium\\IEDriverServer.exe");
		//System.setProperty("webdriver.firefox.bin", "C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", "c:/IEDriverServer.exe"); 
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://sso.edaixi.cn/login?service=http%3A%2F%2Fkefu03.edaixi.cn%2Flogin");
//		driver.findElement(By.cssSelector("img[alt=\"��Ʊ\"]")).click();
//		driver.switchTo().frame("iframepage"); // ��frame�Ĳ���ֱ�ӻ�ȡid��Ҫ������frame����ܻ�ȡ
//		driver.switchTo().frame("main");
//		driver.findElement(By.id("UserName")).sendKeys("xxxx"); // �ʺ�
//		driver.findElement(By.id("password")).sendKeys("xxxx"); // ����
//		driver.findElement(By.cssSelector("img[alt=\"��Ʊ\"]")).click();
		
	}
}
