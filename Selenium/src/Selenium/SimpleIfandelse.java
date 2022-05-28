package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleIfandelse {

	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		/*	WebDriver driver=new ChromeDriver();
		
			driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String title=driver.getTitle();
		if(title.contains("Facebook"))
		{
			System.out.println("Test Case is Passed");
		}
		else
		{
			System.out.println("Test Case is Failed");
		}
		Thread.sleep(4000);
		driver.close(); */
		
	
	//--------------------------------------------------------------------------------
	
 /*	String title=driver.getCurrentUrl();
	if(title.contains("https://www.facebook.com/"))
	{
		System.out.println("URL matched.Test case is passed");
		
	}
	else
	{
		System.out.println("URL matched.Test case is fail");
	}
	
	Thread.sleep(4000);
	driver.close();
	*/
	//-------------------------------------------------------------------------------------------
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
//	JavascriptExecutor js=(JavascriptExecutor) driver;
	//js.executeScript("window.scrollBy(0,300)"); 
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,300)");
	

	
	driver.findElement(By.cssSelector("input#email")).sendKeys("rajaram");
	driver.findElement(By.cssSelector("input#pass")).sendKeys("Raj@123");
// sec way
//	driver.findElement(By.cssSelector("inputtext _55r1 _6luy _9npi")).sendKeys("Raj@123");
	Thread.sleep(4000);
	
	driver.findElement(By.linkText("Forgotten password?")).click();
	
	driver.findElement(By.linkText("About")).click();
	
	String source =driver.getPageSource();
	System.out.println("source code :"+source);//html cha source calculate karto
	}

	
		
	}
	

