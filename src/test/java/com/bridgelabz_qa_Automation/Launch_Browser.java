package com.bridgelabz_qa_Automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Launch_Browser{
	
WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		
		Scanner sc = new Scanner(System.in);
		 
		int variable;
        System.out.println("Please enter the variable value");
        
        variable= sc.nextInt();
        
        switch(variable)
        {
            case 1:
            	System.setProperty("webdriver.edge.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\msedgedriver.exe");
        		driver = new EdgeDriver();
        		break;
        		
            case 2:
            	System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
        		driver = new ChromeDriver();
        		break;
        		
            case 3:
    			System.setProperty("webdriver.gecko.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\geckodriver.exe");
    			driver = new FirefoxDriver();
    			break;
        		
           
        }
	}
        
	
	
	@Test
	
	public void launch_Browser() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println("current page title is:" + title);
		String url = driver.getCurrentUrl();
		System.out.println("current page url is:" + url);
		String sourcecode = driver.getPageSource();
		System.out.println("current page sourcecode is:" + sourcecode);
		driver.close();
	}
	@Test
	public void browser_Navigations() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
	}
	
}
