package methodsOfWebDriver;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	
Point targetPoint= new Point(500,200);
 
 driver.manage().window().setPosition(targetPoint);
}
	}

