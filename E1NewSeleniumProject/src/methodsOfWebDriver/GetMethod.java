package methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();//to launch chromeBrowser
	
	Thread.sleep(2000);//to stop the execution for 5sec

	driver.get("https://www.flipkart.com/");//to launch the  application5
}
}
