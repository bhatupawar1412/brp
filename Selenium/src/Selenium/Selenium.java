package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//open wab page
		driver.get("https://google.com/");
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		WebElement Name =driver.findElement(By.xpath("//tbody/tr[3]/td[3]/input[1]"));
		Name.sendKeys("bhatu pawar");
		

	}

}
