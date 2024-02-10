package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.instagram.com/");
	
	driver.findElement(By.name("username")).sendKeys("qspider");
	driver.findElement(By.name("password")).sendKeys("1230");
	
	WebElement login = driver.findElement(By.xpath("//div[text()='Log in']"));
	login.submit();
	
	
}
}
