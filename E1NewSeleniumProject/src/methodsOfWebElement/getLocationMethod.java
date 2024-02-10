package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocationMethod {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	
	WebElement lgnBtn = driver.findElement(By.id("loginButton"));
	
	Point point = lgnBtn.getLocation();//to get the location of login button
	int x_axis = point.getX();//to get the x_axis point of login button
	int y_axis = point.getY();
	
	System.out.println("X_axis is : "+x_axis+" "+"y_axis is :"+y_axis);//to print the values of X and Y axis
}
}
