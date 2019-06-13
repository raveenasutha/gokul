import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second {

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Greens-14\\eclipse-workspace\\Selinium\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	WebElement txtname=driver.findElement(By.id("identifierId"));
	txtname.sendKeys("nagamani.chillimunth@gmail.com");
	WebElement btnnext=driver.findElement(By.xpath("//span[text()='Next']"));
	btnnext.click();
	WebElement txtpass=driver.findElement(By.name("password"));
	txtpass.sendKeys("nagamani");
	WebElement btnnext1=driver.findElement(By.xpath("//span[text()='Next']"));
	btnnext1.click();
	
	
	
	driver.close();
	

	}

}
