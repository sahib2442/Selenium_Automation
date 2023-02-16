package com.bridgelabz_qa_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindElement_Test {

	WebDriver driver;

	@BeforeTest
	public void setUP() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kader\\eclipse-workspace\\CQA_113_Senelium_Automation\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void find_Link() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		int totalLinks = allLinks.size();
		System.out.println("total number of links present on the web page is : " + totalLinks);
		int visibleLinkCount = 0;
		int hiddenLinkCount = 0;
		for (WebElement link : allLinks) {
			if (link.isDisplayed()) {
				visibleLinkCount++;
				System.out.println(visibleLinkCount + " --> " + link.getText());
			} else {
				hiddenLinkCount++;
			}
		}
		System.out.println("Total number of visible links :" + visibleLinkCount);
		System.out.println("Total number of hidden links :" + hiddenLinkCount);
		driver.close();
		{
		}
	}
	
	@Test
	public void count_Of_Webtable() {
		driver.get("file:///C:/Users/kader/OneDrive/Desktop/Table.html");
        driver.manage().window().maximize();
        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :"+ totalRows);
        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);
        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);
        int countNumberValue = 0;
        int sum=0;
        for (WebElement cell : allCells) {
        String cellValue = cell.getText();
        try{
        int number = Integer.parseInt(cellValue);
        System.out.print(number);
        countNumberValue++;
        sum = sum+number;
        }catch (Exception e) {
        }
        }
        System.out.println("Total count of numeric values is :"+countNumberValue);
        System.out.println("Total sum of all the numeric values is :"+sum);
        driver.close();
    }
}






