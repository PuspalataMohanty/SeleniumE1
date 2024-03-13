package Assignment;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();//launch the browser
    driver.manage().window().maximize();
	
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//section[text()='Frames']")).click();
	driver.findElement(By.xpath("//section[text()='iframes']")).click();
	
	WebElement frameElement= driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	driver.switchTo().frame(frameElement);
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("qspider");
	
	driver.switchTo().defaultContent();//to switch the control back to main webpage
	
	driver.findElement(By.partialLinkText("Nested iframe")).click();//to click on nested iframe option
	
	
}
}
