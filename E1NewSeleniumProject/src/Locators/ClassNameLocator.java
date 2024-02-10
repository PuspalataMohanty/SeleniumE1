package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {
	public static void main(String[] args) throws InterruptedException {
		 

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/TextBox.html");
	
	Thread.sleep(2000);
	
	WebElement passTextBox=driver.findElement(By.className("pass_txt"));//find the web element based on classname
	
	passTextBox.sendKeys("Admin");//to pass input to password textbox
}
}
