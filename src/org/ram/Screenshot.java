package org.ram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\driver\\chromedriver2.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File f = tk.getScreenshotAs(OutputType.FILE);
		File e=new File("C:\\114898_PE719\\out.png");
		FileUtils.copyFile(f,e);
		
		
	}

}
