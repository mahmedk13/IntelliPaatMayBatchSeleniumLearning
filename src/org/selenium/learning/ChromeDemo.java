package org.selenium.learning;

import javax.management.openmbean.OpenMBeanAttributeInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {
	
	public static void main(String[] args) {
		
		String browser = "chrome";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.gecko.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.linkedin.com/"); //get method is launch url
		System.out.println(driver.getCurrentUrl()); //getCurrentUrl is for fetching the opened url
		System.out.println(driver.getTitle());// getTite is used for fetching the title of the webpage
		System.out.println(driver.getWindowHandle()); //getWindowHandle is for fetching the browser session id
		//System.out.println(driver.getPageSource());
		
		WebElement userNameTxtbx = driver.findElement(By.name("session_key"));
		userNameTxtbx.sendKeys("abc");
		
		WebElement passwordTxtbx  = driver.findElement(By.name("session_password"));
		passwordTxtbx.sendKeys("def");
		
		WebElement signInBtn = driver.findElement(By.className("sign-in-form__submit-button"));
		signInBtn.click();
		
		WebElement errorMsg = driver.findElement(By.className("alert-content"));
		String errorText = errorMsg.getText();
		System.out.println(errorText);
		
		if(errorText.contains("enter a valid")) {
			System.out.println("testcase is passed");
		}else {
			System.out.println("testcase is failed");
		}
		
		//driver.close();
		
		
	}
	

}
