package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToScrollTillPerticularWebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide 
		driver.get("https://www.selenium.dev/");
		
		WebElement scrollTarget = driver.findElement(By.xpath("//h2[text()='News']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;//to typecast from  webdriver to javascriptExecuter
		
	    js.executeScript("arguments[0].scrollIntoView(false)",scrollTarget);	
	}

}
