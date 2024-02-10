package SelectionMethods_HandleingDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/Option.html");
	Thread.sleep(2000);
	
	WebElement singleSelectDD = driver.findElement(By.id("menu"));
	
	Select sel=new Select(singleSelectDD);
	sel.selectByIndex(4);
	
}
}