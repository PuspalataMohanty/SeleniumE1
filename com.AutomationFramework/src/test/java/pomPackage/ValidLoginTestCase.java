package pomPackage;

import java.io.IOException;

public class ValidLoginTestCase extends BaseTest{
public static void main(String[] args) throws IOException, InterruptedException {
	BaseTest bt = new BaseTest();
	bt.setUp();
	
	Flib flib = new Flib();
	
	//LoginPage lp = new LoginPage(driver);
	//lp.getUsnTB().sendKeys(flib.readPropertyData(PROP_PATH,"username"));
	//Thread.sleep(1000);
	//lp.getPwdTB().sendKeys(flib.readPropertyData(PROP_PATH,"password"));
	//Thread.sleep(1000);
	//lp.getLoginButton().click();
	LoginPage lp = new LoginPage(driver);
	lp.validLoginMethod(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
	
	HomePageActitime hp=new HomePageActitime(driver);
	hp.getLogoutLink().click();
}
}
