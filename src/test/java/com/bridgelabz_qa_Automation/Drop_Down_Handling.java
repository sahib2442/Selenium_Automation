package com.bridgelabz_qa_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Drop_Down_Handling {
	
WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}
	@Test
	public void select_By_Index() throws InterruptedException {
    	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("kms");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Sahib");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("sahib2001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sahib2001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sahib@2022");
		Thread.sleep(3000);
		WebElement daydrop = driver.findElement(By.name("birthday_day"));
		Select day = new Select(daydrop);
		day.selectByIndex(5);
		Thread.sleep(3000);
		WebElement monthdrop = driver.findElement(By.name("birthday_month"));
		Select month = new Select(monthdrop);
		month.selectByIndex(1);
		Thread.sleep(3000);
		WebElement yeardrop = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yeardrop);
		year.selectByIndex(22);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
	}
	
	@Test
	public void select_By_Value() throws InterruptedException {
    	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("kms");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Sahib");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("sahib2001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sahib2001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sahib@2022");
		Thread.sleep(3000);
		WebElement daydrop = driver.findElement(By.name("birthday_day"));
		Select day = new Select(daydrop);
		day.selectByValue("6");
		Thread.sleep(3000);
		WebElement monthdrop = driver.findElement(By.name("birthday_month"));
		Select month = new Select(monthdrop);
		month.selectByValue("2");
		Thread.sleep(3000);
		WebElement yeardrop = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yeardrop);
		year.selectByValue("2001");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
	}
	
	@Test
	public void select_By_Visible_Text() throws InterruptedException {
    	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
	    Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("kms");
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("Sahib");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("sahib2001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sahib2001@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Sahib@2022");
		Thread.sleep(3000);
		WebElement daydrop = driver.findElement(By.name("birthday_day"));
		Select day = new Select(daydrop);
		day.selectByVisibleText("6");
		Thread.sleep(3000);
		WebElement monthdrop = driver.findElement(By.name("birthday_month"));
		Select month = new Select(monthdrop);
		month.selectByVisibleText("Feb");
		Thread.sleep(3000);
		WebElement yeardrop = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yeardrop);
		year.selectByVisibleText("2001");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
	}
	
	@Test
	public void is_Multiple_Method() throws InterruptedException {
		driver.get("file:///C:/Users/kader/OneDrive/Desktop/ListBox_Breakfast.html");
		driver.manage().window().maximize();
		WebElement list = driver.findElement(By.id("mtr"));
		Select s = new Select(list);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println("Number of elements present inside the listbox is:" +size);
		for(WebElement webElement:options) {
			String text = webElement.getText();
			System.out.println(text);
		}
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("v");
		Thread.sleep(3000);
		s.selectByVisibleText("Poori");
		Thread.sleep(3000);
		List<WebElement> allSelectOptions = s.getAllSelectedOptions();
		int size2 = allSelectOptions.size();
		System.out.println("Number of item that is selected in the list box is:" +size2);
		for(WebElement webElement:allSelectOptions) {
			System.out.println(webElement.getText());
		}
		boolean multiple = s.isMultiple();
		System.out.println(multiple + " yes,it is multi select");
		if(multiple) {
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText()+" is the first selected item in the list box");
			s.deselectByIndex(0);
			Thread.sleep(3000);
			WebElement firstSelectedOption1 =s.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText()+" is the first selected item");
			s.deselectByValue("v");
			Thread.sleep(3000);
			WebElement firstSelectedOption2 =s.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText()+" is the first selected item");
			s.deselectByVisibleText("Poori");
			Thread.sleep(3000);
			driver.close();
			Thread.sleep(3000);
		}
	}
	@Test
	public void auto_Suggestion_Googlesearch() throws InterruptedException {
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> allOptions = driver.findElements(By.xpath("//*[contains(text(),'selenium')]"));
		int count = allOptions.size();
		System.out.println("Number of value present in the dropdown is:" +count);
		String expectedValue = "selenium interview question";
		for(WebElement option:allOptions) {
			String text = option.getText();
			System.out.println(" " +text);
			if(text.equalsIgnoreCase(expectedValue)) {
				option.click();
				break;
			}
		}
	}

}
