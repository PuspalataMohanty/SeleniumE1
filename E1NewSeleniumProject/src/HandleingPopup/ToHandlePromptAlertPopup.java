package HandleingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptAlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//launch the browser
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide implicit wait
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.id("prompt")).click();
	Thread.sleep(2000);
	
	Alert promptAlert = driver.switchTo().alert();//to switch control to the popup
	
	String promptText = promptAlert.getText();//to get the text of the popup and print in console

	Thread.sleep(2000);
	
	promptAlert.sendKeys("my name is puspa");//to pass the inputs to prompt alert popup
	Thread.sleep(2000);
	System.out.println(promptText);
	promptAlert.accept();//to click on OKbutton
}
}
