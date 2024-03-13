package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag {
  @Test(enabled=true)
	  public void login() {
		 Reporter.log("This is login method", true); }
	  @Test(enabled=false)
	  public void addToCart() {
		  Reporter.log("This ia addTOcart method", true);
	  }
	  @Test(enabled=true)
	  public void logout() {
		 Reporter.log("This is Logout Method", true); 
	  }
  }
