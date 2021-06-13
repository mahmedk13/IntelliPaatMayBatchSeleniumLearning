package org.selenium.learning;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickExample {
	
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		
			driver.get("http://demo.guru99.com/test/simple_context_menu.html"); //get method is launch url
		
			WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
			
			//Actions class
			Actions act = new Actions(driver);
			act.doubleClick(doubleClick).perform();
			
			Alert alt = driver.switchTo().alert();
			String text = alt.getText();
			System.out.println(text);
			alt.accept();
			
			
			
		
		
		//driver.close();
		
		
	}
	

}
