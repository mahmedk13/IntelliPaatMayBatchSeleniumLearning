package org.selenium.learning;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {
	
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		
			driver.get("https://demoqa.com/droppable"); //get method is launch url
		
			WebElement draggable = driver.findElement(By.id("draggable"));
			WebElement droppable = driver.findElement(By.id("droppable"));
			
			

			
			Actions act = new Actions(driver);
			act.dragAndDrop(draggable, droppable).perform();
			
			
			
		
		
		//driver.close();
		
		
	}
	

}
