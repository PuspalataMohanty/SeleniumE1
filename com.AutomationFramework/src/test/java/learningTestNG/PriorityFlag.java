package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityFlag {
  @Test(priority=-1)
  public void login() {
	 Reporter.log("This is login method", false); }
  @Test(priority=0)
  public void addToCart() {
	  Reporter.log("This ia addTOcart method", true);
  }
  @Test(priority=5)
  public void logout() {
	 Reporter.log("This is Logout Method", true); 
  }
}