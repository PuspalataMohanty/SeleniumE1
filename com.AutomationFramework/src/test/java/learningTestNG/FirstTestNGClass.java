package learningTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass {

	  @Test(priority=1)
	  public void login() {
		 // System.out.println("this is login method");
		  Reporter.log("this is login method",true);
	  }
	  @Test(priority=2)
	  public void addToCart() {
		  //System.out.println("this is addtocart method");
		  Reporter.log("this is add to cart method");
	  }
	  @Test(priority=3)
	  public void logout() {
		 // System.out.println("this is logout method");
		  Reporter.log("this is logout method");
	  }
  }

