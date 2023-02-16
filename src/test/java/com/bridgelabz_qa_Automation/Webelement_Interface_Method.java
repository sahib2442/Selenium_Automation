package com.bridgelabz_qa_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webelement_Interface_Method {
	
WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	
	@Test
    public void create_new_account_is_display() {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String text = driver.findElement(By.linkText("Create new account")).getText();
        System.out.println("link text is " + text);
        boolean d = driver.findElement(By.name("login")).isDisplayed();
        boolean e = driver.findElement(By.name("login")).isEnabled();
        boolean s = driver.findElement(By.name("login")).isSelected();
        System.out.println("isDisplayed " + d);
        System.out.println("isEnabled " + e);
        System.out.println("isSelected " + s);
    }
    
    @Test
    public void email_sendKeys() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).clear();
    }
    
    @Test
    public void eamil_getTagname() {
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String tagname= driver.findElement(By.id("email")).getTagName();
        System.out.println(tagname);
        driver.close();
    }
    
    @Test
    public void getAttribute() {
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("login"));
        String attri= element.getAttribute("id");
        System.out.println(attri);
        driver.close();
    }
    
    @Test
    public void eamil_getCssValue() {
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String csscolour = driver.findElement(By.id("email")).getCssValue("color");
        System.out.println(csscolour);
        driver.close();
    }
    
    
    @Test
    public void eamil_getlocation() {
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Point point= driver.findElement(By.id("email")).getLocation();
        System.out.println("X: " +point.x);
        System.out.println("y: " +point.y);
        driver.close();
    }
    
    
    @Test
    public void eamil_getSize() {
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement email =driver.findElement(By.name("email"));
        Dimension size= email.getSize();
//        System.out.println("Height=" +size.getHeight());
//        System.out.println("Width=" +size.getWidth());
        int w =size.height;
        int h =size.width;
        System.out.println("Height=" +w);
        System.out.println("Width=" +h);
        driver.close();
        }
    
    @Test
    public void webelement_Clear_And_Sendkey_Method() throws InterruptedException {
    	driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
    }
    
    @Test
    public void webelement_Click_Method() throws InterruptedException {
    	driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }
    

}
