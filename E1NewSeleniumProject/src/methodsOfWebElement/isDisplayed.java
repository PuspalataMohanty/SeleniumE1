package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.instagram.com/");
	
	WebElement lgn = driver.findElement(By.xpath(("//div[text()='Log in']")));
	
	boolean result = lgn.isDisplayed();
	System.out.println(result);
}
}
