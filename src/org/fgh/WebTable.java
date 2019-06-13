package org.fgh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\src\\driver\\chromedriver2.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		//WebElement tf = driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
		/*List<WebElement> trow = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < trow.size(); i++) {
			WebElement r = trow.get(i);
			String t = r.getText();
			System.out.println(t);*/
			List<WebElement> tdata = driver.findElements(By.tagName("td"));
			for (int j = 0; j <tdata.size(); j++) {
				WebElement t2 = tdata.get(j);
				String y = t2.getText();
			
				if(y.equals("509m"));
				tdata.get(4).click();
				System.out.println(y);
				
				
				
			}
			
			
			
		}
		
		}
			
			
		
	

