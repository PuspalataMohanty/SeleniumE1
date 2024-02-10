package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByUniqueAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.fireflink.com/");
			Thread.sleep(3000);
			
			driver.findElement(By.partialLinkText("Sign In")).click();
			Thread.sleep(1000);
			
			WebElement usn = driver.findElement(By.xpath("//input[@name='emailId']"));
			usn.sendKeys("puspamohanty79@gmail.com");
			Thread.sleep(1000);
			
		WebElement pass = driver.findElement(By.xpath("//input[@id='mui-2']"));
		pass.sendKeys("Password@123");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
}
}
