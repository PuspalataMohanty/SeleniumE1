package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartHpLaptop2 {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.flipkart.com/");
	
	
	driver.findElement(By.name("q")).sendKeys("Hp laptop");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	
	driver.findElement(By.xpath("//div[text()='Brand']")).click();
	driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling :: div[@class='_24_Dny']")).click();

	
	driver.findElement(By.xpath("//div[text()='Core i5']/preceding-sibling :: div[@class='_24_Dny']")).click();

	
	driver.findElement(By.xpath("//div[text()='Operating System']")).click();
	driver.findElement(By.xpath("//div[text()='Windows 11'] /preceding-sibling :: div[@class='_24_Dny']")).click();
	
	
	driver.findElement(By.xpath("//div[text()='4★ & above']/preceding-sibling :: div[@class='_24_Dny']")).click();
	
	List<WebElement> laptops = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	
	 List<WebElement> laptopPrice = driver.findElements(By.xpath("//div[@class='_4rR01T'] /ancestor :: div[@class='_3pLy-c row']/descendant :: div[@class='_30jeq3 _1_WHN1']"));
			 for(int i=0;i<laptops.size();i++)
			 {
				 String op=laptops.get(i).getText();
				 
				 for(int j=i;j<=i;j++)
				 {
					 String price=laptopPrice.get(j).getText();
					 System.out.print(op+":"+price);
					// Thread.sleep(1000);
				 }
				 System.out.println();
						
					}
}
}
