package org.selenium.learning;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickExample {
	
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		
			driver.get("https://www.guru99.com/"); //get method is launch url
		
			WebElement testingMenu = driver.findElement(By.xpath("//span[text()='Testing']"));
			
			//Actions class
			Actions act = new Actions(driver);
			act.moveToElement(testingMenu).perform();
			
		
		
		//driver.close();
		
		
	}
	

}
