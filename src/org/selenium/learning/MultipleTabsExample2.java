package org.selenium.learning;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleTabsExample2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tag_frame.asp");
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle(); //window if of parent tab
		WebElement tryitBtn = driver.findElement(By.xpath("//a[text()='Try it Yourself »']"));
		tryitBtn.click();
		
		Set<String> tabs = driver.getWindowHandles();
		
		Iterator<String> itr = tabs.iterator();
		while(itr.hasNext()) {
			String child = itr.next(); //window id of child
			if(!parent.equalsIgnoreCase(child)) { //parent is not child
				driver.switchTo().window(child);
				System.out.println(driver.getTitle()); //tryiteditorv3.6
				driver.close();
			}
		}
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle()); //html frame tag
		driver.close();
		
		
		
		
	
		
	}

}
