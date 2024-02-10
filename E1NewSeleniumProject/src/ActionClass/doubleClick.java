package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	
	Actions act=new Actions(driver);
	
	driver.findElement(By.xpath("//section[text()='Button']")).click();
	driver.findElement(By.partialLinkText("Double Click")).click();
	
	WebElement yesBtn1 = driver.findElement(By.id("btn20"));
	WebElement noBtn2 = driver.findElement(By.id("btn23"));
	WebElement ratingBtn3 = driver.findElement(By.id("btn26"));
	
	act.doubleClick(yesBtn1).perform();
	act.doubleClick(noBtn2).perform();
	act.doubleClick(ratingBtn3).perform();
}
}
