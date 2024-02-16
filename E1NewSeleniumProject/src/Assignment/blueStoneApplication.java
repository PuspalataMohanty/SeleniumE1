package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blueStoneApplication {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bluestone.com/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[text()='Not now']")).click();

	WebElement coins = driver.findElement(By.xpath("//a[text()='Coins '] "));
	Actions act=new Actions(driver);
	act.moveToElement(coins).perform();
	
	driver.findElement(By.xpath("//span[text()='1 gram']")).click();
	
WebElement mousetrp = driver.findElement(By.className("mousetrap"));
	
	boolean result = mousetrp.isDisplayed();
	System.out.println(result);
	
}
}
