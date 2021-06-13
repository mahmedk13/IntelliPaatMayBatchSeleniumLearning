package org.selenium.learning;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FluentWaitExample {

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
		
		
		@SuppressWarnings("unchecked")
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(4))
				    .pollingEvery(Duration.ofSeconds(1))
				    .withMessage("waited for couple of seconds but element not available")
				    .ignoring(NoSuchElementException.class);
	
		
		WebElement bookNowBtn =  (WebElement) wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[text()='Book Now'])[1]")));
		bookNowBtn.click();
		
		
		
		
		
		
		
		
		
		

	}

}
