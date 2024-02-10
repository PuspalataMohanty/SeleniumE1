package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//to launch chromeBrowser
		
		driver.navigate().to("https://www.flipkart.com/");//to launch web APPlication
		
		Thread.sleep(2000);
		
		driver.navigate().back();//to navigate backword
		
		Thread.sleep(2000);
		
		driver.navigate().forward();//to navigate Forword
		
		Thread.sleep(2000);
	
		driver.navigate().refresh();//to refresh webpage

	}
}
