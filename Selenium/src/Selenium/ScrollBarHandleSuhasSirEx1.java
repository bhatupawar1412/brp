package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBarHandleSuhasSirEx1 {

	void GoogleWebOpen(WebDriver driver) {
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("apj abdul kalam");

		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).build().perform();

	}

	void ScrollBarActions(WebDriver driver) throws Exception {
		Actions actions = new Actions(driver);

		actions.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.PAGE_UP).build().perform();

	}

	void javascriptScrollBar(WebDriver driver) throws Exception {
//		WebElement location = driver.findElement(By.xpath(
	//			"//body/div[@id='main']/div[@id='cnt']/div[13]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/update-location[1]"));
		// syntax for javaScript = execute

		// JavascriptExecutor js = (JavascriptExecutor) driver;
          //js.executeScript("arguments[0].scrollIntoView();", location);
		((JavascriptExecutor) driver).executeScript("scroll(0,5000)");

		Thread.sleep(7000);
		//location.click();

		driver.findElement(By.xpath("//a[@aria-label='Page 2']")).click();
//(//a[@class='fl'])[1]
	}

	void closemethod(WebDriver driver) {
		// driver.close();
		// driver.quit();

	}

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);

		ScrollBarHandleSuhasSirEx1 obj = new ScrollBarHandleSuhasSirEx1();
		obj.GoogleWebOpen(driver);
		//obj.ScrollBarActions(driver);
		obj.javascriptScrollBar(driver);
		obj.closemethod(driver);

	}

}
