package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class releaseMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
	
	driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
	//to find the element to be clicked abd hold
	WebElement clickAndHold = driver.findElement(By.id("circle"));
	
	Actions act=new Actions(driver);//to create the object of action class
	act.clickAndHold(clickAndHold).perform();//to perform click and hold operation
	
	Thread.sleep(5000);
	act.release(clickAndHold).perform();//to perform release operation on clicked webElement
}
}
