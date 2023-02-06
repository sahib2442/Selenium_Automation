package com.bridgelabz_qa_Automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_Class_Method {
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
    public void enter_Text_Into_Disable_Field() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("email"));
        actions.contextClick(element).perform();
        Thread.sleep(3000);
    } 
    
    @Test
    public void enter_DoubleClick_Into_Disable_Field() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("pass"));
        actions.doubleClick(element).perform();
        Thread.sleep(3000);
    } 
    
    @Test
    public void move_Element() throws InterruptedException {
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.id("email"));
        Thread.sleep(3000);
        WebElement element1 = driver.findElement(By.id("pass"));
        actions.moveToElement(element1).click().perform();
        Thread.sleep(3000);
        actions.doubleClick(element).perform();
        Thread.sleep(3000);
    } 
    
    @Test
    public void drag_And_Drop() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement pick = driver.findElement(By.id("draggable"));
        WebElement drop  = driver.findElement(By.id("droppable"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.dragAndDrop(pick, drop).perform();
    }
    
    @Test
    public void click_Hold_And_Release() throws InterruptedException {
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        WebElement pick = driver.findElement(By.id("draggable"));
        WebElement drop  = driver.findElement(By.id("droppable"));
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.clickAndHold(pick).perform();
        actions.moveToElement(drop).release();
    }

}
