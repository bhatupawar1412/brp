package Selenium;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuhasLocalhost2Class {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		//
		// Scrolle
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,200)");
		

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.get("http://localhost:3000/");
		// get title of web page
		driver.getTitle();

		// maximise title of page
		driver.manage().window().maximize();

		WebElement ui = driver.findElement(By.xpath("//div[contains(text(),'UI Automation Testing')]"));

		ui.click();

		WebElement email = driver.findElement(By.xpath("//input[@class='email_input']"));
		email.sendKeys("suhas.awale");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("suhas@123");
		email.click();

		WebElement Login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Login.click();
		js.executeScript("window.scrollBy(0,400)");

		Thread.sleep(5000);

		// -------------------------------------------------------------------------------------------------------------------------------------------

		// new windows
		driver.findElement(By.xpath("//button[text()='Open new tab']")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> objitr = windows.iterator();
        
		String parentwindows=objitr.next();
		String childwindows=objitr.next();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(parentwindows);
		driver.getTitle();
		Thread.sleep(2000);
		
		driver.switchTo().window(childwindows);
		WebElement search =driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("Taj Mahal");
		//driver.findElement(By.name("btnK")).click();
		// sec way
		Actions actions=new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();
		
		//driver.findElement(By.xpath(""))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
