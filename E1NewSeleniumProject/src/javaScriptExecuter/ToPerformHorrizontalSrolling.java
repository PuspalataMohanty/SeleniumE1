package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformHorrizontalSrolling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//launch the browser

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide implicit wait
	driver.get("https://omayo.blogspot.com/");
	JavascriptExecutor js=(JavascriptExecutor)driver;//to typecast from  webdriver to javascriptExecuter
	
	js.executeScript("window.scrollBy(500,0)");//to perform scroll right operation
	Thread.sleep(2000);
	
	js.executeScript("window.scrollBy(-150,0)");//to perform scroll right operation
	Thread.sleep(2000);
	driver.close();
}
}
