package com.bridgelabz_qa_Automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScript_Execution_Test {
	
WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
	public void scroll_Down_WebPage() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(2000);
	}
	@Test
	public void enter_Text_Into_Disabled_Field() throws InterruptedException {
		driver.get("file:///C:/Users/kader/OneDrive/Desktop/DesabledField.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('t1').value='sahib'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value='kader'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').type='button'");
		Thread.sleep(2000);
	}

}
