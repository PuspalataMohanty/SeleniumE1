package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DescriptionFlag {
  @Test(description="this method is for login",priority=2)
  public void login() {
	  Reporter.log("login Method", true);
  }
  @Test(description="this method is for add to cart",priority=3)
 public void addToCart() {
	  Reporter.log("addto cart method", true);
  }
  @Test(description="this method is for logout",priority=4)
 public void logout() {
	Reporter.log("Logout method", true);  
 }
}
