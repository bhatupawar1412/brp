package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDownEX1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		String country = "India";
		String searchcountry = "In";

		WebElement autosearch = driver.findElement(By.id("autosuggest"));
		autosearch.sendKeys(searchcountry);

		List<WebElement> objsectcounty = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		Thread.sleep(4000);
		for (WebElement objsec : objsectcounty)

		{
           if (objsec.getText().equalsIgnoreCase(country)) 
            
            {
				objsec.click();
			}

		}

	}

}
