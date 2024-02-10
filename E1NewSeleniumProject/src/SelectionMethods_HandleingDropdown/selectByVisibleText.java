package SelectionMethods_HandleingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectByVisibleText {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/Option.html");
	
	WebElement ssd = driver.findElement(By.id("menu"));
	Select s=new Select(ssd);
	s.selectByVisibleText("dosa");
	
}
}
