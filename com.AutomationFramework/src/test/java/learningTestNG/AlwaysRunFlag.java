package learningTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag {
  @Test
  public void login() {
	  Assert.fail();
	 Reporter.log("This is login method", true); }
  @Test(dependsOnMethods="login")
  public void addToCart() {
	  Reporter.log("This ia addTOcart method", true);
  }
  @Test(dependsOnMethods="addToCart",alwaysRun=true)
  public void logout() {
	 Reporter.log("This is Logout Method", true); 
  }
}
