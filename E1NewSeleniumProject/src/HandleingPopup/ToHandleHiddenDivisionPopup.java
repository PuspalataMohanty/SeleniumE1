package HandleingPopup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();//launch the browser
	      driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//to provide implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));//to declaire Explicit wait
		driver.get("https://www.makemytrip.com/flights/");
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
     	js.executeScript("window.scrollBy(0,200)");//to perform scrolldown operations
		Thread.sleep(2000);
	
	    driver.findElement(By.xpath("//div[text()='March 2024']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='28']")).click();
		
		Thread.sleep(2000);
		driver.close();
	}

}
