package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector2 {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	Thread.sleep(1000);
	//to find username textbox
	WebElement usnTB=driver.findElement(By.cssSelector("input[aria-label^='Ph']"));
	usnTB.sendKeys("qspiders");
	Thread.sleep(1000);
	
	//to find password textbox
WebElement passTB=driver.findElement(By.cssSelector("input[type$='word']"));
	passTB.sendKeys("pass@123");
	Thread.sleep(1000);
	
	//to click login button
	driver.findElement(By.cssSelector("button[type*='bm']")).click();
}
}

