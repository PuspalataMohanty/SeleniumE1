package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActitimeAssertion {
  @Test
  public void login() {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  driver.get("http://puspa/login.do");
	  
	  String expectedLoginPageTitle = "actiTIME - Login  ";
	  
	  //For Critical Testcase
	  Assert.assertEquals(driver.getTitle(), expectedLoginPageTitle,"Login page is not displayed");
	  
	  WebElement usn = driver.findElement(By.name("username"));
	  Assert.assertEquals(usn.isDisplayed(), true, "username textbox is not displayed");
	  usn.sendKeys("admin");
	  
	  WebElement pwd = driver.findElement(By.name("pwd"));
	  Assert.assertEquals(pwd.isDisplayed(),true,"password textbox is not displayed");
	  pwd.sendKeys("manager");
	  
	  WebElement login = driver.findElement(By.id("loginButton"));
	  Assert.assertEquals(login.isDisplayed(),true,"Login button is not displayed");
	  login.click();
  }
}
