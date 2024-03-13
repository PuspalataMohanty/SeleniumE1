package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToSwitchUsingParentFrameMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions CO = new ChromeOptions();
		CO.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(CO);//launch the browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//to provide implicit wait

		driver.get("https://www.bluestone.com/");//LAUNCH THE APPLICATION
		//Thread.sleep(2000);
	
		WebElement chatFrame = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(chatFrame);
		
		driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//input[@type='nametext']")).sendKeys("123");
		
}
}
