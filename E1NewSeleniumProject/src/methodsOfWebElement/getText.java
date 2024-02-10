package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	
	WebElement lgnBtn = driver.findElement(By.id("loginButton"));
	String loginText = lgnBtn.getText();//to get the text of login button
	
	System.out.println(loginText);// to print the text of login button in the console
	
	WebElement linkText = driver.findElement(By.id("licenseLink"));
	
	String link = linkText.getText();//to get the text of the link
	System.out.println("link");//to print the text of the link
}
}
