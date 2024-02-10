package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocator {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/TextBox.html");//to launch web application
		
		Thread.sleep(2000);
		
		WebElement textBox=driver.findElement(By.tagName("input"));//find password TextField on the webpage
		
		textBox.sendKeys("manager");//to pass the inputs to password textfield
		
		//Note:- Inputs are passed to username textfield because  it is a first element designed with input tag
	}
}
