package org.selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

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
		
	
		WebDriverWait wait = new WebDriverWait(driver, 4);
		
		WebElement bookNowBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[text()='Book Now'])[1]")));
		bookNowBtn.click();
		
		
		
		
		
		
		
		
		
		

	}

}
