package org.selenium.learning;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverExample {
	
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		
			driver.get("http://demo.guru99.com/test/simple_context_menu.html"); //get method is launch url
		
			WebElement rightClick = driver.findElement(By.xpath("//*[@id='authentication']/span"));
			
			//Actions class
			Actions act = new Actions(driver);
			act.contextClick(rightClick).perform();
			
			WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
			copy.click();
			
		
		
		//driver.close();
		
		
	}
	

}
