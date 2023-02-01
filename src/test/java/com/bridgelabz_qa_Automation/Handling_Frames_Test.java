package com.bridgelabz_qa_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handling_Frames_Test {
	WebDriver driver;
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
	public void frame_Handling_Test() throws InterruptedException {
		driver.get("file:///C:/Users/kader/OneDrive/Desktop/page2.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("t2")).sendKeys("sahib");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("t1")).sendKeys("kader");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
	}

}
