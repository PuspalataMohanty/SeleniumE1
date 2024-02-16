package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformScrollingOperations {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide 
	driver.get("https://www.selenium.dev/");
	JavascriptExecutor js=(JavascriptExecutor)driver;//to typecast from  webdriver to javascriptExecuter
	
	
	js.executeScript("window.scrollBy(0,1000)");//to perform scrolldown operations
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-500)");//to perform scroll up operation
	Thread.sleep(2000);
	
}
}
