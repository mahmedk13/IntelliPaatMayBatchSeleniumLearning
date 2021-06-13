package org.selenium.learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitProblem {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement calendar = driver.findElement(By.id("ddate"));
		calendar.click();
		
		WebElement date = driver.findElement(By.id("trd_1_14/06/2021"));
		date.click();
		
		WebElement searchBtn = driver.findElement(By.className("src_btn"));
		searchBtn.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement bookNowBtn = driver.findElement(By.xpath("(//button[text()='Book Now'])[1]"));
		bookNowBtn.click();
		
		
		

	}

}
