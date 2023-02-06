package com.bridgelabz_qa_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Locators_Test {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
	public void locators() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("8438311032");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgetten")).click();
	}
	
	@Test
	public void locators_xpath() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("kadersahib1234@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("8438311032"); 
     	        driver.findElement(By.xpath("//button[contains(@id,'u_0_')]")).click();
     	        driver.findElement(By.linkText("Forgetten")).click();
	}
	@Test
	public void locators_Signup() {
		driver.get("https://www.facebook.com/signup/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kader");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahib");
		driver.findElement(By.xpath("//input[@name=\'reg_email__\']")).sendKeys("sahib2001@gmail.com");
		driver.findElement(By.xpath("//input[@name=\'reg_email_confirmation__\']")).sendKeys("sahib2001@gmail.com");
		driver.findElement(By.xpath("//input[@name=\'reg_passwd__\']")).sendKeys("Sahib@2022");
		driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("6");
		driver.findElement(By.xpath("//select[@name='birthday_month']")).sendKeys("Feb");
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2001");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_5')]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']"));
	}
	@Test
	public void locators_Facebook() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("facebook:" + title);
		driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("8438311032");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.close();
		
		
		
	}

}
