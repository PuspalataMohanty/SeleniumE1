package DeselectionMethodsHandleing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselectByVisibleText {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/MultilevelOption.html");
		
		WebElement msd= driver.findElement(By.id("menu"));
		Select s=new Select(msd);
		Thread.sleep(1000);
		s.selectByVisibleText("dosa");
		Thread.sleep(1000);
		s.deselectByVisibleText("dosa");
}
}
