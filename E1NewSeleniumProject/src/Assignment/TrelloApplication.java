package Assignment;

import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TrelloApplication {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	Actions act=new Actions(driver);
	driver.get("https://trello.com/home");
	driver.findElement(By.linkText("Log in")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("puspaboni0987@gmail.com");
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Puspa@0987");
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[text()='abc']")).click();
	
	WebElement javaS = driver.findElement(By.xpath("//a[text()='java']"));
	WebElement SQLs = driver.findElement(By.xpath("//a[text()='sql']"));
   WebElement manualS = driver.findElement(By.xpath("//a[text()='manual']"));
	WebElement seleniumS = driver.findElement(By.xpath("//a[text()='selenium']"));
	WebElement PYTHONs = driver.findElement(By.xpath("//a[text()='python']"));
	WebElement apiS = driver.findElement(By.xpath("//a[text()='api']"));
	
	
	WebElement DETAILS = driver.findElement(By.xpath("//h2[text()='mock details']"));
	WebElement SCHEDULE = driver.findElement(By.xpath("//h2[text()='mock schedule']"));
	WebElement GIVEN = driver.findElement(By.xpath("//h2[text()='mock given']"));
	WebElement PENDING = driver.findElement(By.xpath("//h2[text()='mock pending']"));
	Thread.sleep(1000);
	Actions dragAndDrop=act.dragAndDrop(javaS,GIVEN);
	dragAndDrop.perform();
	
	  

	
}
}
