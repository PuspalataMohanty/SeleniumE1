package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
  @Test
  public void login() {
	 Reporter.log("This is login method", true); }
  @Test(dependsOnMethods = "login")
  public void addToCart() {
	  Reporter.log("This ia addTOcart method", true);
  }
  @Test(dependsOnMethods = "addToCart")
  public void logout() {
	 Reporter.log("This is Logout Method", true); 
  }
}
