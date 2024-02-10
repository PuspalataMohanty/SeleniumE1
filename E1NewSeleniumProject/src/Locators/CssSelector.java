package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	//to find username textbox
	WebElement usnTB=driver.findElement(By.cssSelector("input[aria-label='Phone number, username, or email']"));
	usnTB.sendKeys("qspiders");
	Thread.sleep(1000);
	
	//to find password textbox
WebElement passTB=driver.findElement(By.cssSelector("input[type='password']"));
	passTB.sendKeys("pass@123");
	Thread.sleep(1000);
	
	//to click login button
	driver.findElement(By.cssSelector("button[type='submit']")).click();
}
}
