
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fourth {

	public static void main(String[] args)
    {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\src\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement txtname1=driver.findElement(By.name("firstname"));
		txtname1.sendKeys("nagamani");
		WebElement txtname2=driver.findElement(By.name("lastname"));
		txtname2.sendKeys("laxmi");
		WebElement txtname3=driver.findElement(By.name("reg_email__"));
		txtname3.sendKeys("9876543210");
		WebElement txtname4=driver.findElement(By.id("u_0_t"));
		txtname4.sendKeys("laxmi");
		WebElement birthDay1=driver.findElement(By.id("day"));
		Select s= new Select(birthDay1);

		WebElement birthDay2=driver.findElement(By.id("month"));
		Select s1= new Select(birthDay2);
		s1.selectByValue("2");
		WebElement birthDay3=driver.findElement(By.id("year"));
		Select s2= new Select(birthDay3);
		s2.selectByValue("2014");
		WebElement gender=driver.findElement(By.id("u_0_7"));
		gender.click();
		WebElement button=driver.findElement(By.id("u_0_z"));
		button.click();
		

	}

}
