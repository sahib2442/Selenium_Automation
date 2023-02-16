package com.bridgelabz_qa_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TESTNG {
	
WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
   @Test
	
	public void testNg() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
}
	
	@BeforeMethod
	 public void beforeMethod() {
	 Reporter.log("beforeMethod", true);
	 }
	@AfterMethod
	 public void afterMethod() {
	 Reporter.log("afterMethod", true);
	 }
	 @BeforeClass
	 public void beforeClass() {
	 Reporter.log("beforeClass", true);
	 }
	 @AfterClass
	 public void afterClass() {
	 Reporter.log("afterClass", true);
	 }
	 @BeforeTest
	 public void beforeTest() {
	 Reporter.log("beforeTest", true);
	 }
	 @AfterTest
	 public void afterTest() {
	 Reporter.log("afterTest", true);
	 }
	@BeforeSuite
	 public void beforeSuite() {
	 Reporter.log("beforeSuite", true);
	}
	@AfterSuite
	 public void afterSuite() {
	 Reporter.log("afterSuite", true);
	}

}
