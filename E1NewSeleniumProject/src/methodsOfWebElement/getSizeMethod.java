package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizeMethod {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	//to find username textbox and store in a variable
	WebElement usnTb = driver.findElement(By.name("username"));
	
	Dimension size = usnTb.getSize();
	
	int height = size.getHeight();
	
	int width = size.getWidth();
	System.out.println("height is :"+height);
	System.out.println("width is :"+width);
	
}
}
