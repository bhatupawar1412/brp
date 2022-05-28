package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowsOpenJavascrift {

	//New Tap Open Process
	
	WebDriver driver;

	public void m1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		// ((JavascriptExecutor)driver).executeScript("window.open()");

		driver.get("https://www.facebook.com");
		js.executeScript("window.open()"); 
		
	}

	void m2() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("hppt://yahoo.com");
		Thread.sleep(4000);

		WebDriver driver1 = new ChromeDriver();
		driver1.get("google.com");
	}

	void m3() 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		 driver =new ChromeDriver ();
		WebElement link=driver.findElement(By.tagName("a"));
		String keyString = Keys.CONTROL+Keys.SHIFT.toString()+Keys.ENTER.toString();
	
	link.sendKeys(keyString);
	
	
	}
	
	

	public static void main(String[] args) throws Exception {
		NewWindowsOpenJavascrift obj = new NewWindowsOpenJavascrift();
		// obj.m1();
		//obj.m2();
		obj.m3();
		
	}

}
