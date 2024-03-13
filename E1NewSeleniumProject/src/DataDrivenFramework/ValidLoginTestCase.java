package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("http://puspa/login.do");
	
	Flib flib = new Flib();
	 
	  //String usnData = flib.readExcelData("./Data/testData.xlsx", "validcreds", 1, 0);
	  //String pwdData = flib.readExcelData("./Data/testData.xlsx", "validcreds", 1, 1);

		driver.findElement(By.name("username")).sendKeys(flib.readExcelData("./Data/testData.xlsx", "validcreds", 1, 0));
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData("./Data/testData.xlsx", "validcreds", 1, 1));
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
}
}
