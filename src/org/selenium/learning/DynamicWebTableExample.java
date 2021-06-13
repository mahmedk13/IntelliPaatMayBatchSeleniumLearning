package org.selenium.learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableExample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse_workspace_15Maybatch\\SeleniumLearning\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		WebElement table = driver.findElement(By.className("dataTable"));
		
//		List<WebElement> cols = table.findElements(By.tagName("th"));
//		System.out.println("number of cols are: "+cols.size());
//		
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		System.out.println("number of rows are: "+rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']//th"));
		System.out.println("number of cols are: "+cols.size());
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("number of rows are: "+rows.size());
		
		for(int rowNum=1; rowNum<=rows.size(); rowNum++ ) {
			for(int colNum=1; colNum<=cols.size(); colNum++) {
				WebElement element = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+rowNum+"]//td["+colNum+"]"));
				System.out.println("text of the row: "+rowNum+" and col "+colNum+" is: "+element.getText());
			}
			
		}

		
		
		
		

	}

}
