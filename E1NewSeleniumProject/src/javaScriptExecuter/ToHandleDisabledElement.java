package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.language.Argument;
import graphql.parser.antlr.GraphqlParser.ArgumentsContext;

public class ToHandleDisabledElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));//to provide 

	driver.get("https://demoapps.qspiders.com/ui?scenario=1");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//li[text()='Disabled']")).click();
	Thread.sleep(1000);
	
	WebElement disabledTextBox = driver.findElement(By.id("name"));
	JavascriptExecutor js=(JavascriptExecutor)driver;//to typecast into javascriptexecuter
	js.executeScript("document.getElementById('name').value='admin'");//to pass input to disabled element
	Thread.sleep(1000);
	//js.executeScript("document.getElementById('name').value=''");//to clear the content from disabled textbox
	
	js.executeScript("arguments[0].value=''",disabledTextBox);
}

}
