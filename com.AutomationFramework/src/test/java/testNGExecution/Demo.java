package testNGExecution;

import java.time.Duration;

import javax.swing.GroupLayout.Group;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	  
  @Test(groups="Functional Test")
  public void demo() throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
	 driver.get("https://www.google.com/");
	 Thread.sleep(2000);
	 driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	 
	 Thread.sleep(2000);
	 driver.quit();
  }
}
