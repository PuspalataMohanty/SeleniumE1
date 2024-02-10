package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://puspa/login.do");
			
			WebElement lgnBtn = driver.findElement(By.id("loginButton"));//to find login button
			String lgnTag = lgnBtn.getTagName();// to get the tagname of login button
			System.out.println(lgnTag);//to print the tagname of username textbox in console
}
}
