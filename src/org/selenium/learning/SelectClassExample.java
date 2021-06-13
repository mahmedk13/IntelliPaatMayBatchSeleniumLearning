package org.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.service.DriverService;
import org.openqa.selenium.support.ui.Select;

public class SelectClassExample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	
	
		driver.get("https://www.wikipedia.org/"); //get method is launch url
		
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		
		Select sel = new Select(dropdown);
		//sel.selectByVisibleText("Bahasa Indonesia");
		//sel.selectByValue("hi");
		//sel.selectByIndex(4);
		
		WebElement firstSelect = sel.getFirstSelectedOption();
		System.out.println(firstSelect.getText());
		
		List<WebElement> list = sel.getAllSelectedOptions();
		
		for(WebElement ele: list) {
			System.out.println(ele.getText());
		}
		
		//System.out.println(sel.isMultiple());
		
		//1st way
//		List<WebElement> list = sel.getOptions();
//		
//		for(WebElement elem: list) {
//			System.out.println(elem.getText());
//		}
		
		// 2nd way
//		List<WebElement> list = driver.findElements(By.tagName("option"));
//		
//		for(WebElement ele: list) {
//			System.out.println(ele.getText());
//		}
		
		
		
		
		
		
		
		
		
	
	}

}
