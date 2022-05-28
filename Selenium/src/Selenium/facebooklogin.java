package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebooklogin {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg");

		/*
		 * driver.get("https://www.facebook.com");
		 * 
		 * WebElement name111=driver.findElement(By.linkText("Create New Account"));
		 * name111.click();
		 */

		WebElement name = driver.findElement(By.xpath("//*[@name='firstname']"));

		name.sendKeys("kiran");

		WebElement surname = driver.findElement(By.xpath("//input[@name='lastname']"));

		surname.sendKeys("Patil");

		WebElement mobile = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		mobile.sendKeys("2233556644");

		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("kiran@123");

		WebElement select = driver.findElement(By.xpath("//select[@id='day']"));

		select.click();

		Select dropdownday = new Select(select);
		dropdownday.selectByIndex(11); // 11 index number
		// dropdownday.selectByvalue("12"); //12 day value

		WebElement month = driver.findElement(By.xpath("//*[@name='birthday_month']"));
		month.click();

		Select dropdown1 = new Select(month);
		dropdown1.selectByValue("12");
		month.click();

		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		year.click();

		Select dropdown2 = new Select(year);
		dropdown2.selectByValue("1996");
		year.click();

		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));

		gender.click();

		WebElement sign = driver.findElement(By.xpath("//*[@name='websubmit']"));

		//sign.click();
		String sourcecode = driver.getPageSource();
		System.out.println("source code :"+sourcecode);
	}

}
