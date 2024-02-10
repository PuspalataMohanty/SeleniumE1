package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));//to declaire implicit wait

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//to declaire Explicit wait
	
	driver.get("https://www.shoppersstack.com/");
	
	driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 Pro']")).click();
	
	driver.findElement(By.xpath("//input[@id='Check Delivery']")).sendKeys("411033");
	
//	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//button[@id='Check']"))));
	//driver.findElement(By.xpath.click();
	
	WebElement checkButton = driver.findElement(By.xpath("//button[@id='Check']"));
	wait.until(ExpectedConditions.elementToBeClickable(checkButton));
	checkButton.click();
	
}
}
