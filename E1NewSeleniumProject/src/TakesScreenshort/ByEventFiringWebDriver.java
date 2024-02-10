package TakesScreenshort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

public class ByEventFiringWebDriver {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.instagram.com/");
	
	 EventFiringWebDriver efwd = new EventFiringWebDriver(driver);//to create the object of eventfiringwebdriver class and pass the referance
	
	File src = efwd.getScreenshotAs(OutputType.FILE);//to take the screensort of webpage
	
	File dest = new File("./screenshorts/Insta.png");//to specify the location,name and extension
	
	Files.copy(src, dest);//to copy and paste the screenshort in the specified folder
}
}
