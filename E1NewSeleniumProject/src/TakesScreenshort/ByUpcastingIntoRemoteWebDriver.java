package TakesScreenshort;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByUpcastingIntoRemoteWebDriver {
public static void main(String[] args) throws IOException {
	RemoteWebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	
	File src = driver.getScreenshotAs(OutputType.FILE);//to take the screensort of webpage
	
	File dest = new File("./screenshorts/Amazon.png");//to specify the location,name and extension
	
	Files.copy(src, dest);//to copy and paste the screenshort in the specified folder
}
}
