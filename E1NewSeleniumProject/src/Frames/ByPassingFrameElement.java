package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByPassingFrameElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//launch the browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//to provide implicit wait

		driver.get("https://www.dream11.com/");//LAUNCH THE APPLICATION
		Thread.sleep(2000);
		
		//To identify the frame by writing xpath
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
		
		//To pass the referance of frame element
		driver.switchTo().frame(frameElement);
		
		//to perform operation on element designed inside frame
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("6372997707");
	}
}
