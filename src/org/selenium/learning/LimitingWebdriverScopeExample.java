package org.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LimitingWebdriverScopeExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		WebElement footer = driver.findElement(By.className("footer"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement ele: links) {
			System.out.println(ele.getAttribute("href"));
		}
	}

}
