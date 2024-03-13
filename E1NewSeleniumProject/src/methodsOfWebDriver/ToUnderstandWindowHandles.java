package methodsOfWebDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandWindowHandles {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://omayo.blogspot.com/");
	String parentWindow = driver.getWindowHandle();//to get the adress of parent window
	System.out.println(parentWindow);//to print the parent window adress in the console
	String parenttitle = driver.getTitle();//to get the title of parent window
	
	driver.findElement(By.partialLinkText("Open a popup window")).click();//to open a new window
	Set<String> allWindows = driver.getWindowHandles();//to get the adress of all the windows
	
	//to iterate and switch the control to the windows one by one
	for(String wh:allWindows)
	{
		String title = driver.switchTo().window(wh).getTitle();//to get the title eof each window
		
		if(!title.equals(parenttitle))//to compare the titles with parent window title
		{
			driver.close();//to close the child window
		}
	}
}
}
