package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	
	WebElement lgnBtn = driver.findElement(By.id("loginButton"));//to find login button
	Rectangle RECT = lgnBtn.getRect();
	System.out.println(RECT.getHeight());
	System.out.println(RECT.getWidth());
	System.out.println(RECT.getX());
	System.out.println(RECT.getY());
	}
}
