package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	void Openpage(WebDriver driver)
	{
		   driver.manage().window().maximize(); 
           driver.get("https://www.google.com/");

	
	}
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	           WebDriver driver = new ChromeDriver();
	           
	           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	          // WebDriverWait wait= new WebDriverWait(driver, 10);
	
	       
	        
	}
}
