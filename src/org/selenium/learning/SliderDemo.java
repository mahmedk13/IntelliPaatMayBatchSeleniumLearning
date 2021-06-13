package org.selenium.learning;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
		
		
			driver.get("https://jqueryui.com/resources/demos/slider/default.html"); //get method is launch url
			driver.manage().window().maximize();
			
			WebElement bar = driver.findElement(By.id("slider"));
			double width = bar.getSize().width/2.1;
			//double height = bar.getSize().height;
			
			WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));
			
			Actions act = new Actions(driver);
			act.dragAndDropBy(slider, (int)width, 0).perform();
			
			
			
		
		
		//driver.close();
		
		
	}
	

}
