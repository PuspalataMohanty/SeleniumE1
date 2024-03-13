package KeywordDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class ValidLoginTestcase extends BaseTest {


public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt=new BaseTest();
	bt.setUp();
 Flib flib=new Flib();
      
		
		String usn =flib.readPropertyData(PROP_PATH ,"username");
		String	pwd=flib.readPropertyData(PROP_PATH ,"password");
		
		driver.findElement(By.name("username")).sendKeys(usn);
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		bt.tearDown();

	}
}

