package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class GoogleFrame {
public static void main(String[] args) throws IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();//launch the browser
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//to provide implicit wait

	driver.get("https://www.google.com/");//LAUNCH THE APPLICATION
	
	driver.findElement(By.xpath("//a[@class='gb_d']")).click();
	
	WebElement MapIframe = driver.findElement(By.xpath("//iframe[@name='app']"));
	driver.switchTo().frame(MapIframe);
	
	driver.findElement(By.xpath("//span[text()='Maps']")).click();
	
	Thread.sleep(2000);
	
	TakesScreenshot ts=(TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);//to take the screenshort of the webpage
	
	File dest = new File("./screenshorts/GoogleMap.png");//to specify the path-name-extension
	
	Files.copy(src, dest);
	
}
}
