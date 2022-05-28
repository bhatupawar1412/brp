package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class3Sel {
	
	void m1(WebDriver driver,WebDriverWait wait)
	{
		driver.get("https://www.facebook.com/reg");
		
		driver.manage().window().maximize();
	}
	
	void m2(WebDriver driver)
	{
		WebElement name=driver.findElement(By.xpath("//input [@name='firstname']"));
		name.sendKeys("kiran");
		
		WebElement surname=driver.findElement(By.xpath("//input [@name='lastname']"));
		surname.sendKeys("patil");
		
		WebElement number=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		number.sendKeys("1234567894");
		
		WebElement password=driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("kiran@123");
	}
	void m3(WebDriver driver)
	{
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		day.click();
		
		Select obj = new Select(day);
		obj.selectByValue("14");
		
		WebElement month=driver.findElement(By.id("month"));
		month.click();
		Select objm=new Select (month);
		objm.selectByValue("12");
		month.click();
		
		 WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
		month.click();
		Select objy=new Select (year);
		objy.selectByValue("1996");
	}
	void m4(WebDriver driver)
	{
		WebElement driv1=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		
		driv1.click();
		
	}
	public static void main(String[] args) {
		
		Class3Sel obj =new Class3Sel ();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebDriverWait wait=new WebDriverWait(driver, 0);
		
		obj.m1(driver, wait);
		obj.m2(driver);
		obj.m3(driver);
		obj.m4(driver);
	}

}
