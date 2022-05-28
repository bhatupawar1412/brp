package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollBarHandleSuhasSir {

	void GoogleWbOpen(WebDriver driver)
	{
		driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("APj abdul Kalam");
		
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
	}
	void Scrobar(WebDriver driver) throws Exception
	{
	Actions action =new Actions(driver);
	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(4000);
	action.sendKeys(Keys.PAGE_UP).build().perform();
		
	}
	void javaSript(WebDriver driver) throws InterruptedException
	{
		WebElement location=driver.findElement(By.xpath("//*[@class='xSQxL HDOrGf']"));
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView();", location);
	Thread.sleep(4000);
	location.click();
	
	}
	
	
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

       WebDriver driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  
       ScrollBarHandleSuhasSir obj=new ScrollBarHandleSuhasSir ();
       obj.GoogleWbOpen(driver);
       obj.Scrobar(driver);
       obj.javaSript(driver);
	}

}
