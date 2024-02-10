package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLinkdin {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://in.linkedin.com/");
	Thread.sleep(1000);
	
	driver.findElement(By.id("session_key")).sendKeys("puspaboni0987@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Password@0987");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("button[data-tracking-control-name^='homepage-basic_sign-in-submit']")).click();
	
	}
}
