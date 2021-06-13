package org.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]")).click();;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("abc");
		boolean isFirstNameEnabled = firstName.isEnabled();
		System.out.println("is firstname text box enabled? "+isFirstNameEnabled); //true
		
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("def");
		
		WebElement emailAddress = driver.findElement(By.name("reg_email__"));
		emailAddress.sendKeys("abc@xyz.com");
		System.out.println("is email address field displayed "+emailAddress.isDisplayed());
		
		WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
		reEnterEmail.sendKeys("abc@xyz.com");
		
		WebElement pwd = driver.findElement(By.name("reg_passwd__"));
		pwd.sendKeys("123456");
		
		Select sel = null;
		
		WebElement dob = driver.findElement(By.name("birthday_day"));
		sel = new Select(dob);
		sel.selectByVisibleText("8");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		sel = new Select(month);
		sel.selectByIndex(3);
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		sel = new Select(year);
		sel.selectByValue("1998");
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		System.out.println("is female radio button selected: "+gender.get(0).isSelected());//false
		gender.get(0).click();
		System.out.println("is female radio button selected: "+gender.get(0).isSelected()); //true
		
		driver.findElement(By.name("websubmit")).click();

		
		
		
		
		

		
	}

}
