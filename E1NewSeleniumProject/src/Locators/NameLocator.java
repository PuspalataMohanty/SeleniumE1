package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(2000);
	
	WebElement usnTB=driver.findElement(By.name("email"));
	
    usnTB.sendKeys("admin");
    
    WebElement passTB=driver.findElement(By.name("pass"));
    
    passTB.sendKeys();
    
    driver.findElement(By.name("login")).click();
}
}
