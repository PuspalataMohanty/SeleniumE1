package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttribute {
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://puspa/login.do");
	
	//driver.findElement(By.xpath("//input[@name='username' or @type='password']"));
	
	driver.findElement(By.xpath("//input[@name='username' and @type='text']")).sendKeys("123");
}
}
