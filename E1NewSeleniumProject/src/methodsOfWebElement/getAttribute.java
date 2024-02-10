package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	//to find username textbox and store in a variable
	WebElement usnTb = driver.findElement(By.name("username"));
	
	String attributeValue = usnTb.getAttribute("type");
	System.out.println(attributeValue);
	
}
}
