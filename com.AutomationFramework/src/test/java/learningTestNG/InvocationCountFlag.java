package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountFlag {
	  @Test(priority=2)
	  public void login() {
		  Reporter.log("login Method", true);
	  }
	  @Test(priority=3,invocationCount=5)
	 public void addToCart() {
		  Reporter.log("addto cart method", true);
	  }
	  @Test(priority=4)
	 public void logout() {
		Reporter.log("Logout method", true);  
	 }
}
