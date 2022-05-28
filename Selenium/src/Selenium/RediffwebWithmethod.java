package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffwebWithmethod {
	
	void method(WebDriver driver,WebDriverWait wait)
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();

		WebElement Name = driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
		Name.sendKeys("Bhatu Pawar");

		WebElement id = driver.findElement(By.xpath("//tbody/tr[7]/td[3]/input[1]"));
		id.sendKeys("bhatupawar1234@gmai.com");

		WebElement password = driver.findElement(By.xpath("//tbody/tr[9]/td[3]/input[1]"));
		password.sendKeys("bhatu@4321");

		
		
	}
 void m1(WebDriver driver)
 {
	 WebElement Repassword = driver.findElement(By.xpath("//tbody/tr[11]/td[3]/input[1]"));
		Repassword.sendKeys("bhatu@4321");
		
		WebElement mailAddress = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
		mailAddress.sendKeys("bhatupatil@4321");
		
		WebElement number = driver.findElement(By.xpath("//input[@id='mobno']"));
		number.sendKeys("1234882888");

 }
 void m2(WebDriver driver)
 {
	 WebElement day = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		day.click();
		Select obj = new Select(day);
		obj.selectByValue("21");
		// day.click();
		
		WebElement month = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		month.click();
		Select objmonth = new Select(month);
		objmonth.selectByVisibleText("APR");
		month.click();
		
		WebElement year = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		year.click();
		Select objyear = new Select(year);
		objyear.selectByValue("2004");
		year.click();
 }
 void m3(WebDriver driver) throws InterruptedException
 {
	 WebElement male = driver.findElement(By.xpath("//tbody/tr[24]/td[3]"));
		male.click();

		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		country.click();

		Select countryobj = new Select(country);
		countryobj.selectByValue("99");
		country.click();

		// countryobj.selectByVisibleText("");
		Thread.sleep(3000);


		WebElement city = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/select[1]"));
		city.click();

		Select cityobj = new Select(city);
		cityobj.selectByValue("Delhi");
		Thread.sleep(3000);
		city.click();
		// countryobj.selectByVisibleText("");

		WebElement capture= driver.findElement(By.xpath("//tbody/tr[32]/td[3]/input[1]"));
		capture.sendKeys("Y3LL");
		
		WebElement createacc= driver.findElement(By.xpath("//input[@id='Register']"));
		createacc.click();
		
	 
 }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RediffwebWithmethod obj=new RediffwebWithmethod();
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
		WebDriverWait wait= new WebDriverWait (driver, 20);
		
		obj.method(driver, wait);
		obj.m1(driver);
		obj.m2(driver);
		obj.m3(driver);
	}

}
