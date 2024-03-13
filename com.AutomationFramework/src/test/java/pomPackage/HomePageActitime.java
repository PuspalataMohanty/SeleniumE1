package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageActitime {
	
	//declaration
@FindBy(xpath="//div[text()='Time-Track']/ancestor::a/descendant::img")private WebElement timeTrackModule;
@FindBy(xpath="//div[text()='Tasks']/following-sibling::img")private WebElement taskModule;
@FindBy(xpath="//div[text()='Reports']/following-sibling::img")private WebElement reportsModule;
@FindBy(xpath="//div[text()='Users']/following-sibling::img")private WebElement usersModule;
@FindBy(xpath="//div[text()='Work Schedule']/following-sibling::img")private WebElement workSchedule;
@FindBy(xpath="//div[text()='Settings']/following-sibling::img")private  WebElement settings;
@FindBy(xpath="//a[text()='Logout']")private WebElement logoutLink;


//initialization
  public HomePageActitime(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }


public WebElement getTimeTrackModule() {
	return timeTrackModule;
}


public WebElement getTaskModule() {
	return taskModule;
}


public WebElement getReportsModule() {
	return reportsModule;
}


public WebElement getUsersModule() {
	return usersModule;
}


public WebElement getWorkSchedule() {
	return workSchedule;
}


public WebElement getSettings() {
	return settings;
}


public WebElement getLogoutLink() {
	return logoutLink;
}
  
}
