package org.hfg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\src\\driver\\chromedriver2.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		
		
		
		WebElement tst = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",tst);
		Thread.sleep(2000);
		 WebElement fd = driver.findElement(By.xpath("//div[@class='_1jA3uo _34niwY']"));
			js.executeScript("arguments[0].click()",fd);
			
//			WebElement fg = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
//			 js.executeScript("argument[0],setAttribute('value','green')", fg);
//			 WebElement ts = driver.findElement(By.xpath("//input[@type='password']"));
//			 js.executeScript("arguments[0].setAttribute('value','java3464')",ts);
		//WebElement fn = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		
		
		
	}

}
