package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookLoginAndClickFriends {
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8658219642");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("mohanty@5292");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	Thread.sleep(10000);
	
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Friends']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Friend Requests']")).click();
	
}
}
