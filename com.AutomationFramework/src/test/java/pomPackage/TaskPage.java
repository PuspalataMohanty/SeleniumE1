package pomPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskPage {
@FindBy(xpath="//a[text()='Projects & Customers']")private WebElement projectsandCustomersLink;
@FindBy(xpath="//input[@value='Create New Customer']")private WebElement createNewCustomerButton;
@FindBy(name="name")private WebElement customerNameTextBox;
@FindBy(name="createCustomerSubmit")private WebElement createCustomerSubmit;
@FindBy(xpath="//input[contains(@value,' Cancel')]")private WebElement createUserCancelButton;
@FindBy(xpath="//input[@value='Create New Project']")private WebElement createnewProjectButton;
@FindBy(name="customerId")private WebElement selectCustomerDropdown;
@FindBy(name="name")private WebElement projectNameTB;
@FindBy(name="createProjectSubmit")private WebElement createProjectButton;
@FindBy(xpath="//input[contains(@value,' Cancel')]")private WebElement createProjectCancelButton;
@FindBy(linkText="All")private WebElement allCustomerAndProjectsLink;
@FindBy(xpath="//input[@value='Delete Selected']")private WebElement deleteSelectedButton;
@FindBy(xpath="//input[@value='Archive Selected']")private WebElement archiveSelectedButton;
@FindBy(id="deleteButton")private WebElement deleteThisCustomerPopup;

public TaskPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getProjectsandCustomersLink() {
	return projectsandCustomersLink;
}

public WebElement getCreateNewCustomerButton() {
	return createNewCustomerButton;
}

public WebElement getCustomerNameTextBox() {
	return customerNameTextBox;
}

public WebElement getCreateCustomerSubmit() {
	return createCustomerSubmit;
}

public WebElement getCreateUserCancelButton() {
	return createUserCancelButton;
}

public WebElement getCreatenewProjectButton() {
	return createnewProjectButton;
}

public WebElement getSelectCustomerDropdown() {
	return selectCustomerDropdown;
}

public WebElement getProjectNameTB() {
	return projectNameTB;
}

public WebElement getCreateProjectButton() {
	return createProjectButton;
}

public WebElement getCreateProjectCancelButton() {
	return createProjectCancelButton;
}

public WebElement getAllCustomerAndProjectsLink() {
	return allCustomerAndProjectsLink;
}

public WebElement getDeleteSelectedButton() {
	return deleteSelectedButton;
}

public WebElement getArchiveSelectedButton() {
	return archiveSelectedButton;
}
public WebElement getDeleteThisCustomerPopup() {
	return deleteThisCustomerPopup;
}

public void createCustomerMethod(String CustomerName) throws InterruptedException {
	Thread.sleep(1000);
	projectsandCustomersLink.click();
	createNewCustomerButton.click();
	customerNameTextBox.sendKeys(CustomerName);
	createCustomerSubmit.click();
}
public void createProjectMethod(String CustomerName,String projectName)
{
	projectsandCustomersLink.click();
	createnewProjectButton.click();
	
	Select sel=new Select(selectCustomerDropdown);
	sel.selectByVisibleText(CustomerName);
	
	projectNameTB.sendKeys(projectName);
	createProjectButton.click();
}
public void deleteAllCustomersAndProjects() throws InterruptedException
{
	Thread.sleep(1000);
	projectsandCustomersLink.click();
	projectsandCustomersLink.click();
	allCustomerAndProjectsLink.click();
	deleteSelectedButton.click();
	deleteThisCustomerPopup.click();
}
}
