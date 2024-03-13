package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {

	@FindBy(xpath="//input[@value='Create New User']")private WebElement createNewUserButton;
	@FindBy(xpath="//input[@name='username']")private WebElement usernameTB;
	@FindBy(xpath="//input[@name='passwordText']")private WebElement passwordTB;
    @FindBy(xpath="//input[@name='passwordTextRetype']")private WebElement passwordTextRetypeTB;
    @FindBy(xpath="//input[@name='firstName']")private WebElement firstNameTB;
	@FindBy(xpath="//input[@name='lastName']")private WebElement lastNameTB;
	@FindBy(id="right12")private WebElement modifyTimeTrackCheckBox;
	@FindBy(id="right2")private WebElement manageCustomerAndProjectsCheckBox;
	@FindBy(id="right1")private WebElement  generatesReportsCheckbox;
	@FindBy(id="right5")private WebElement  manageUserCheckbox;
	@FindBy(id="right7")private WebElement  manageBillingtypeCheckbox;
	@FindBy(xpath="//input[@type='submit']")private WebElement createuserButton;
	@FindBy(xpath="//input[contains(@value,' Cancel')]")private WebElement cancelButton;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
//rightclick-sourse-generate getter & setter method
	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getPasswordTextRetypeTB() {
		return passwordTextRetypeTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyTimeTrackCheckBox() {
		return modifyTimeTrackCheckBox;
	}

	public WebElement getManageCustomerAndProjectsCheckBox() {
		return manageCustomerAndProjectsCheckBox;
	}

	public WebElement getGeneratesReportsCheckbox() {
		return generatesReportsCheckbox;
	}

	public WebElement getManageUserCheckbox() {
		return manageUserCheckbox;
	}

	public WebElement getManageBillingtypeCheckbox() {
		return manageBillingtypeCheckbox;
	}

	public WebElement getCreateuserButton() {
		return createuserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	public void createNewUserMethod(String usn,String pwd,String fname,String lname) throws InterruptedException {
		Thread.sleep(1000);
		usernameTB.sendKeys(usn);
		passwordTB.sendKeys(pwd);
		passwordTextRetypeTB.sendKeys(pwd);
		Thread.sleep(1000);
		firstNameTB.sendKeys(fname);
		lastNameTB.sendKeys(lname);
		Thread.sleep(1000);
		modifyTimeTrackCheckBox.click();
		manageCustomerAndProjectsCheckBox.click();
		generatesReportsCheckbox.click();
		manageUserCheckbox.click();
		manageBillingtypeCheckbox.click();
		Thread.sleep(1000);
		createuserButton.click();
	}
}
