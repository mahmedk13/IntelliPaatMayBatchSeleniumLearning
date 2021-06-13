package org.selenium.learning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement calendar = driver.findElement(By.id("ddate"));
		calendar.click();
		
		WebElement date = driver.findElement(By.id("trd_1_14/06/2021"));
		date.click();
		
		WebElement searchBtn = driver.findElement(By.className("src_btn"));
		searchBtn.click();
		
	
	//it will not wait for entire 5 mins	
		WebElement bookNowBtn = driver.findElement(By.xpath("(//button[text()='Book Now'])[1]"));
		bookNowBtn.click();
		
		//1000 elements in your test suite
		//1000*5=5000 seconds
		//83 mins of execution got wasted
		//8 hours of execution got wasted
		
		
		
		
		
		
		

	}

}
