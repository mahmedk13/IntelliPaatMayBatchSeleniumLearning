package org.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.manage().window().maximize();
		
	
		
		//1. name of the frame
		//2. index of the frame
		//3. webelement of the frame
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		WebElement tryit = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryit.click();
		
		
		
		driver.switchTo().defaultContent();
		WebElement homeBtn = driver.findElement(By.id("tryhome"));
		homeBtn.click();
		
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
		for(WebElement f: frames) {
			System.out.println("name of the frame is "+f.getAttribute("name"));
			System.out.println("id of the frame is "+f.getAttribute("id"));
		}
		
		
		
		
	}

}
