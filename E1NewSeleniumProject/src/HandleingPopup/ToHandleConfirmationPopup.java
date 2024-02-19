package HandleingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmationPopup {
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();//launch the browser
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide implicit wait
	driver.get("https://omayo.blogspot.com/");//to launch the application
	
	driver.findElement(By.id("confirm")).click();//to generate popup
	Thread.sleep(2000);
	
	Alert confirmationAlert = driver.switchTo().alert();
	Thread.sleep(2000);
	//confirmationAlert.accept();//to click ok button
	
	confirmationAlert.dismiss();//to click cancel button
	driver.close();
}
}
