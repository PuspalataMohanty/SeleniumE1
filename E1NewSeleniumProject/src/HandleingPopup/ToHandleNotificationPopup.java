package HandleingPopup;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ToHandleNotificationPopup {
public static void main(String[] args) {
	
	ChromeOptions CO = new ChromeOptions();
	CO.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(CO);//launch the browser
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//to provide implicit wait

	driver.get("https://www.easemytrip.com/");//LAUNCH THE APPLICATION
	
}
}
