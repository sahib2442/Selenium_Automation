package com.bridgelabz_qa_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validating_Page_Test {
WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
    public void page_Url_Validation() {
    	
    	driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String expectedUrl = "https://www.facebook.com/";
        String actaulUrl = driver.getCurrentUrl();
        System.out.println("the expected url is:" + expectedUrl);
        System.out.println("the acual url is:" + actaulUrl);
        if(actaulUrl.equals(expectedUrl))
        {
        	System.out.println("url validation success");
        }
        else
        {
        	System.out.println("url validation failed");
        }
	}
	@Test
    public void page_Title_Validation() {
    	
    	driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        String expectedTitle = "Facebook – log in or sign up";
        String actaulTitle = driver.getTitle();
        System.out.println("the expected title is:" + expectedTitle);
        System.out.println("the acual title is:" + actaulTitle);
        if(actaulTitle.equals(expectedTitle))
        {
        	System.out.println("title validation successs");
        }
        else
        {
        	System.out.println("title validation failed");
        }
	}
	@Test
    public void page_Validation_Using_Web_Element() {
    	
    	driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.name("email"));
        if(element.isDisplayed())
        {
        	System.out.println("element is displayed successfully");
        }
        else
        {
        	System.out.println("element is not displayed");
        }
    }
    
    @Test
    public void email_Error_Message() {
    	  driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          driver.findElement(By.name("login")).click();
          String expectedError = "Find your account and log in.";
          System.out.println("expected error is:" +expectedError);
          WebElement element = driver.findElement(By.linkText("Find your account and log in."));
          String actualError = element.getText();
          if(actualError.equals(expectedError))
          {
        	  System.out.println("error message is validated");
          }
          else
          {
        	  System.out.println("error message is not validated");
        	  
          }
    	
    }
    @Test
    public void password_Error_Message() {
    	  driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          driver.findElement(By.id("email")).sendKeys("kadersahib1234@gmail.com");
          driver.findElement(By.name("login")).click();
          String expectedError = "Forgotten password?";
          System.out.println("expected error is:" +expectedError);
          WebElement element = driver.findElement(By.linkText("Forgotten password?"));
          String actualError = element.getText();
          if(actualError.equals(expectedError))
          {
        	  System.out.println("error message is validated");
          }
          else
          {
        	  System.out.println("error message is not validated");
        	  
          }
    	
    }
    @Test
    public void create_Error_Message() {
    	  driver.get("https://www.facebook.com/");
          driver.manage().window().maximize();
          driver.findElement(By.id("email")).sendKeys("fvcbn1234@gmail.com");
//          driver.findElement(By.name("pass")).sendKeys("12@20012");
          driver.findElement(By.name("login")).click();
          String expectedError = "Create a new Facebook account.";
          System.out.println("expected error is:" +expectedError);
          WebElement element = driver.findElement(By.linkText("Create a new Facebook account."));
          String actualError = element.getText();
          if(actualError.equals(expectedError))
          {
        	  System.out.println("error message is validated");
          }
          else
          {
        	  System.out.println("error message is not validated");
        	  
          }
    	
    }

}
