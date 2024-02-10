package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCssValue {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	
	WebElement loginBtn = driver.findElement(By.id("loginButton"));//to find login button and store in  a variable
	String cssValue = loginBtn.getCssValue("background");//to get the css value used for background
	System.out.println(cssValue);//to print the received value in the console
	
	String color = loginBtn.getCssValue("colour");//to get the colour of login button
	System.out.println(color);//to print the values in the console
}
}
