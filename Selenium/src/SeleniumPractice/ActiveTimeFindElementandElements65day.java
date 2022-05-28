package SeleniumPractice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveTimeFindElementandElements65day {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
//wrong username path and check findElement
	//	driver.findElement(By.cssSelector("input[id='username11']")).sendKeys("admin");

//findElements
		List<WebElement> unfiled = driver.findElements(By.id("username11"));
		System.out.println("number of WebElements ="+unfiled.size());
		unfiled.get(0).sendKeys("admin");
//
	}
}
