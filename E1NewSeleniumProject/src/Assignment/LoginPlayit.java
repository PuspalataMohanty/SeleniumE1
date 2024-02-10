package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPlayit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.playit.app/login");
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[placeholder='User name']")).sendKeys("Puspa@123");
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("password123");
			Thread.sleep(1000);
			
			driver.findElement(By.className("btn")).click();
			
			
}
}
