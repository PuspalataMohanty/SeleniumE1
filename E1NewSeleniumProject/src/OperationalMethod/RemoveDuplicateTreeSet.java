package OperationalMethod;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateTreeSet {
public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/MultilevelOption.html");
		WebElement multiSelectDropdown= driver.findElement(By.id("menu"));
		Select s=new Select(multiSelectDropdown);
		
		TreeSet<String> ts = new TreeSet <String>();
		
		List<WebElement> options = s.getOptions();
		
		for(WebElement we:options)
		{
			String textToInsert = we.getText();
			ts.add(textToInsert);
		}
		for(String t:ts)
		{
			System.out.println(t);
		}
	
}
}
