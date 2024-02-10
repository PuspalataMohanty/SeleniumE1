package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginJioApplication {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.jio.com/selfcare/login/");
			Thread.sleep(1000);
			
			driver.findElement(By.cssSelector("input[data-testid='numberField']")).sendKeys("6372997707");
	Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("div[style='flex-basis: unset;']")).click();
	}
}
