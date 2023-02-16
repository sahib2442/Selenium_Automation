package com.bridgelabz_qa_Automation;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Handaling_Popup__Test {
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
    public void alert_Popup_Test() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
    
    @Test
    public void confirm_Popup_Test() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
    
    @Test
    public void prompt_Popup__Test() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(3000);
    }
    
    @Test
	public void  hidden_Division_Popup() throws InterruptedException {
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='flex flex-middle  t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer pr-2 pl-3 pt-2 pb-2 ba br-4 h-8 c-neutral-900']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Feb 04 2023']")).click();
    }
    
    @Test
	public void  file_Upload_Popup() throws IOException  {
		driver.get("https://www.freepdfconvert.com/pdf-to-word");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Choose PDF file")).click();
		Runtime.getRuntime().exec("C:\\Users\\kader\\OneDrive\\Upload.exe");
	}
    
    @Test
    public void file_Upload_Using_Sendkey() {
    	driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
    	driver.manage().window().maximize();
    	driver.findElement(By.xpath("//input[@type='file'][@multiple='']")).sendKeys("C:\\Users\\kader\\Downloads");
    	driver.findElement(By.xpath("//button[@type='button'][@ng-click='uploader.uploadAll()']")).click();
    }
   
   @Test
   public void file_Download_Using_Firefox() throws InterruptedException {
	    HashMap<String, Object> firefoxPrefs = new HashMap<String, Object>(); 
	    firefoxPrefs.put("profile.default_content_settings.popups", 0); 
	    firefoxPrefs.put("download.default_directory", "C:\\Users\\admin\\Downloads\\Default Folder"); 
    	FirefoxOptions options = new FirefoxOptions();
    	String key = "browser.helperApps.neverAsk.saveToDisk";
    	String value = "aplication/zip";
    	options.addPreference(key, value);
    	options.addPreference("browser.download.folderList", 2);
    	options.addPreference("browser.download.dir", "C:\\Users\\kader");
    	DesiredCapabilities cap = new DesiredCapabilities();
    	cap.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
//    	driver = new FirefoxDriver(cap);
      	driver.get("http://www.seleniumhq.org/download/");
      	driver.manage().window().maximize();
      	String xp = "//div[3]//div[1]//div[2]//p[2]//a[1]"; 
  	    driver.findElement(By.xpath(xp)).click();
    	Thread.sleep(2000);
    }
        
    @Test
	public void FileDownload_WithChrome() throws InterruptedException {
	  HashMap<String, Object> chromePrefs = new HashMap<String, Object>(); 
	  chromePrefs.put("profile.default_content_settings.popups", 0); 
	  chromePrefs.put("download.default_directory", "C:\\Users\\admin\\Downloads\\Default Folder"); 
	  ChromeOptions options = new ChromeOptions(); 
	  options.setExperimentalOption("prefs", chromePrefs);
	  DesiredCapabilities cap = new DesiredCapabilities();  
	  cap.setCapability(ChromeOptions.CAPABILITY, options); 
//	  driver = new ChromeDriver(cap);
	  driver.get("http://www.seleniumhq.org/download/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000); 
	  String xp = "//div[3]//div[1]//div[2]//p[2]//a[1]"; 
	  driver.findElement(By.xpath(xp)).click();
	}
    
    
    @Test
    public void get_The_Window_ID_Test() {
    	 driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         String windowid = driver.getWindowHandle();
         System.out.println("The currend window id is:" +windowid);
    }
    
    @Test
    public void child_Browser_Popup() throws InterruptedException {
    	 driver.get("https://www.irctc.co.in/nget/profile/user-registration");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         String parentid = driver.getWindowHandle();
         Thread.sleep(2000);
         System.out.println("The currend window id is:" +parentid);
         driver.findElement(By.xpath("//a[@aria-label='Menu Hotels. Website will be opened in new tab']")).click();
         Set<String> allwindowid = driver.getWindowHandles();
         System.out.println("The all window id's are:" +allwindowid);
         int count = allwindowid.size();
         System.out.println("The number of windows opened by selenium are:" +count);
         driver.quit();
    }
    @Test
    public void child_Browsers_Popup() throws InterruptedException {
    	 driver.get("https://www.irctc.co.in/nget/profile/user-registration");
         driver.manage().window().maximize();
         Thread.sleep(2000);
         String parentid = driver.getWindowHandle();
         Thread.sleep(2000);
         System.out.println("The currend window id is:" +parentid);
         driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();
         Set<String> allwindowid = driver.getWindowHandles();
         System.out.println("The all window id's are:" +allwindowid);
         int count = allwindowid.size();
         System.out.println("The number of windows opened by selenium are:" +count);
         driver.quit();
    }

}
