package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithMyntra {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://shareit.didacte.com/en/users/sign_in");
	Thread.sleep(1000);
	
	
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("puspa@gmail.com");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("password123");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	
}
}
