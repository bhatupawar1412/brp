package Selenium;

import java.io.DataInput;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuhasSirLocalHostWeb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("http://localhost:3000/");
		//get title of web page
		driver.getTitle();
		
		//maximise title of page
		driver.manage().window().maximize();
		
		WebElement ui=driver.findElement(By.xpath("//div[contains(text(),'UI Automation Testing')]"));
		
		ui.click();
		
		WebElement email=driver.findElement(By.xpath("//input[@class='email_input']"));
		email.sendKeys("suhas.awale");
		
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("suhas@123");
		email.click();
		
		WebElement Login=driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Login.click();
		
		WebElement textbox=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		textbox.sendKeys("what is this");
		
		WebElement select=driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
		select.click();
		
		Select dropdown =new Select(select);
		dropdown.selectByIndex(2);
		Thread.sleep(3000);
		dropdown.selectByValue("option4");
		Thread.sleep(3000);
		dropdown.selectByVisibleText("Option 1");
		
		WebElement checkbox1=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/input[1]"));
		checkbox2.click();
		
		WebElement checkbox3=driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/input[1]"));
		checkbox3.click();

		WebElement radio1=driver.findElement(By.xpath("//input[@id='radio1']"));
		radio1.click();
		
		
		WebElement inputnumber =driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
		inputnumber.click();
		
		WebElement inputnumber1 =driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
		inputnumber1.click();
		
		inputnumber.sendKeys("414");
		
		inputnumber1.click();
		
		//----------------------------------------------------------------------

		driver.findElement(By.xpath("//button[contains(text(),'Open new tab')]")).click();
		
		// Set<DataType> objname=Arrayname.iterator(); // syntax

		Set<String> windows = driver.getWindowHandles();

		Iterator<String> objitr = windows.iterator();

		String parentWindows = objitr.next();
		String childwindows = objitr.next();

		
		Thread.sleep(4000);
		driver.switchTo().window(parentWindows);
		driver.getTitle();
		Thread.sleep(4000);
		
		driver.switchTo().window(childwindows);
		WebElement searchtext =driver.findElement(By.xpath("//input[@name='q']"));
		searchtext.click();
		searchtext.sendKeys("m s dhoni");
		driver.findElement(By.name("btnK")).click(); ////input[@name='btnK']
		
		//Thread.sleep(4000);
		
	}

}
