package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\src\\driver\\chromedriver2.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//WebElement txn = driver.findElement(By.id("username"));
	
//	js.executeScript("arguments[0].setAttribute('value','raveenakolathaivel@gmail.com')",txn);
//	 WebElement tsn = driver.findElement(By.id("password"));
//		 js.executeScript("arguments[0].setAttribute('value','java234465')",tsn);
//		 WebElement tsn1 = driver.findElement(By.id("login"));
		 //js.executeScript("arguments[0].setAttribute('value','java2')",tsn1);
		 WebElement fd = driver.findElement(By.xpath("//div[@class='_1jA3uo _34niwY']"));
		js.executeScript("argument[0].click()", fd);
		WebElement fg = driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']"));
		 js.executeScript("argument[0],setAttribute('value','green')", fg);
		 WebElement ts = driver.findElement(By.xpath("//input[@type='password']"));
		 js.executeScript("arguments[0].setAttribute('value','java3464')",ts);
		/*WebElement txn = driver.findElement(By.id("username"));
		
		   js.executeScript("arguments[0].scrollIntoView(true)",txn);
		   Thread.sleep(200);
		  WebElement up = driver.findElement(By.xpath("//div[@id='client-logo']"));
		  js.executeScript("arguments[0].scrollIntoView(false)",up);
	   */
	}

}
