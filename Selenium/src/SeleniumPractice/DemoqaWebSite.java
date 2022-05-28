package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import okio.Options;

public class DemoqaWebSite {

	void demoqaOpenPage(WebDriver driver) {
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
	}

	void ElementSolve(WebDriver driver) {

		driver.findElement(By.cssSelector("img[alt='adplus-dvertising']")).click();
		driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]"))
				.click();
		driver.findElement(By.xpath("(//li[@class='btn btn-light active'])")).click();
		//driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]")).click();
	}
	void Close(WebDriver driver) throws Exception
	{
		Thread.sleep(4000);
		driver.close();
	}

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		DemoqaWebSite obj = new DemoqaWebSite();

		obj.demoqaOpenPage(driver);
		obj.ElementSolve(driver);

	}

}
