import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {

	public static void main(String[] args)
    {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtname1=driver.findElement(By.id("email"));
	txtname1.sendKeys("nagamani");
	WebElement txtname2=driver.findElement(By.id("pass"));
	txtname2.sendKeys("laxmi");
     WebElement button=driver.findElement(By.id("u_0_2"));
     button.click();
     //driver.close();
    
    
	}

}
