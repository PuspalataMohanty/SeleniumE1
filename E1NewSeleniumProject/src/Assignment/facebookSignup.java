package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignup {

public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");

	WebElement dayDropdown = driver.findElement(By.id("day"));
	WebElement monthDropdown=driver.findElement(By.id("month"));
	WebElement yearDropdown=driver.findElement(By.id("year"));
	
	Select daySelect= new Select(dayDropdown);
	boolean res1 = daySelect.isMultiple();
	System.out.println("dayDropdown is multiple ?:"+res1);
	
	List<WebElement> day = daySelect.getOptions();
	for(WebElement we:day)
	{
		System.out.println(we.getText());
	}
	daySelect.selectByIndex(16);
	System.out.print("----------------------------------------------");
	System.out.println();
	
	Select monthSelect=new Select(monthDropdown);
	boolean res2 = monthSelect.isMultiple();	
	System.out.println("Month Dropdown is multiple?"+res2);
	
	List<WebElement> monthOptions = monthSelect.getOptions();
	for(WebElement we:monthOptions)
	{
		System.out.println(we.getText());
	}
	
	monthSelect.selectByValue("6");
	System.out.print("----------------------------------------------");
	System.out.println();
	
	}



}
