package OperationalMethod;

import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateHashSet {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/MultilevelOption.html");
	WebElement multiSelectDropdown= driver.findElement(By.id("menu"));
	Select s=new Select(multiSelectDropdown);
	
	HashSet<String> hs = new HashSet <String>();
	List<WebElement> options = s.getOptions();
	
	for(int i=0;i<options.size();i++)
	{
		String textToInsert = options.get(i).getText();
		hs.add(textToInsert);
	}
	for(String text:hs)
	{
		System.out.println(text);
	}	
}
}
