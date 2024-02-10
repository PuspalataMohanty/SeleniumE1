package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextFunction {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://puspa/login.do");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
	
	
	//WebElement lgnBtn = driver.findElement(By.xpath("//a[text()='Login']"));
	//lgnBtn.click();
	
	WebElement lgnBtn = driver.findElement(By.xpath("//a[.='Login']"));
	lgnBtn.click();
}
}
