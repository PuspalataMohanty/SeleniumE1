package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenWebElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide 

	driver.get("https://www.facebook.com/signup");
	Thread.sleep(1000);
	WebElement hiddenElement = driver.findElement(By.name("custom_gender"));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].value='qspiders'",hiddenElement);
}
}
