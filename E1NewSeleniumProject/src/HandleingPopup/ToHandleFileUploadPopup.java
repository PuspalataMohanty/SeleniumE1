package HandleingPopup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launch the browser
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//to provide implicit wait

		driver.get("https://omayo.blogspot.com/");//LAUNCH THE APPLICATION	
		WebElement fileUpload = driver.findElement(By.id("uploadfile"));
		Actions act=new Actions(driver);
		act.click(fileUpload).perform();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("./program/File_x64.exe");	
	}

}
