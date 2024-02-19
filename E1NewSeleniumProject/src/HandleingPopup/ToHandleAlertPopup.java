package HandleingPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleAlertPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//launch the browser

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide implicit wait
	driver.get("https://omayo.blogspot.com/");
	
	driver.findElement(By.id("alert1")).click();//to generate alert popup
	Thread.sleep(3000);
	Alert alertPopup = driver.switchTo().alert();//to switch the control to alert popup
	
	//alertPopup.accept();//to click on ok button
	alertPopup.dismiss();
}
}
