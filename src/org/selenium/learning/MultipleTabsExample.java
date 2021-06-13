package org.selenium.learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsExample {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		driver.manage().window().maximize();
		
		WebElement tryitBtn = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		tryitBtn.click();
		
		List<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(tabs.get(1));
		
		System.out.println(driver.getTitle());
		//driver.close(); is for closing the tab where your focus is
		
		driver.switchTo().window(tabs.get(0));
		System.out.println(driver.getTitle());
		//driver.close();
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	
		
	}

}
