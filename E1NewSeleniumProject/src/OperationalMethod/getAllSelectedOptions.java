package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getAllSelectedOptions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/MultilevelOption.html");
	
	WebElement msd= driver.findElement(By.id("menu"));
	Select s=new Select(msd);
	Thread.sleep(1000);
	
	for(int i=0;i<=10;i++)
	{
		s.selectByIndex(i);
	}
	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
	
	for(WebElement we:allSelectedOptions)
	{
		String selectedOptions = we.getText();
		System.out.println(selectedOptions);
		}
	}
}
