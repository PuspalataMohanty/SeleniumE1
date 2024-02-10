package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysMethod {
public static void main(String[] args) {                                                  
		WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("http://puspa/login.do");
			//to find username textbox and store in a variable
			driver.findElement(By.name("username")).sendKeys("admin");
			//to find password textbox and store in a variable
			driver.findElement(By.name("pwd")).sendKeys("manager");
}
}
