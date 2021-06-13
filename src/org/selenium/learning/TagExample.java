package org.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagExample {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		for(WebElement ele: images) {
			System.out.println(ele.getAttribute("src"));
		}
		
	}

}
