package Practice;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prac {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/Users/PUSPA/Desktop/WebElements/MultilevelOption.html");

     WebElement ssd = driver.findElement(By.id("menu"));
     Select sel=new Select(ssd);
     sel.selectByVisibleText("dosa");
     Thread.sleep(1000);
     sel.deselectByVisibleText("dosa");
}
}
