package org.selenium.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDemo {
	
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		
		System.setProperty("webdriver.gecko.driver", path+"\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.linkedin.com/"); //get method is launch url
		System.out.println(driver.getCurrentUrl()); //getCurrentUrl is for fetching the opened url
		System.out.println(driver.getTitle());// getTite is used for fetching the title of the webpage
		System.out.println(driver.getWindowHandle()); //getWindowHandle is for fetching the browser session id
		System.out.println(driver.getPageSource());
		driver.close();
		
	}

}
