package Practice;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class prac {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Prompt Alert Box']")).click();
Thread.sleep(2000);
Alert gettxt = driver.switchTo().alert();
String gt = gettxt.getText();
System.out.println(gettxt);
Thread.sleep(2000);
gettxt.sendKeys("yes");
gettxt.accept();
Thread.sleep(2000);
driver.close();
}
}
