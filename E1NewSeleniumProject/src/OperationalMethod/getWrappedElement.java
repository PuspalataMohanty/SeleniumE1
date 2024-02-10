package OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getWrappedElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/MultilevelOption.html");
	
	WebElement msd= driver.findElement(By.id("menu"));
	Select s=new Select(msd);
	
	WebElement elements = s.getWrappedElement();
	String textOfOptions = elements.getText();
	System.out.println(textOfOptions);
}
}
