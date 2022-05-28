package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class goibiboEx1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		WebElement Autosuggest = driver.findElement(
				By.xpath("//*[contains(text(),'From')][1]"));
		Autosuggest.sendKeys("pu");
		// no run...try again
		List<WebElement> startclck=driver.findElements(By.id("#autoSuggest-list"));
		for(WebElement city: startclck)
		{
			if(city.getText().equalsIgnoreCase("pune"))
			{
				Thread.sleep(4000);
				city.click();
			}
		}
	}

}
