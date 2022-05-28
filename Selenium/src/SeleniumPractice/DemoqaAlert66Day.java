package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoqaAlert66Day {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		/*
		 * driver.findElement(By.id("promtButton")).click(); Thread.sleep(2000);
		 * driver.switchTo().alert().sendKeys("Acceleration");
		 * driver.switchTo().alert().accept();
		 */
		
		driver.findElement(By.xpath("(//*[text()='Click me'])[1]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//*[text()='Click me'])[2]")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		WebElement click4 = driver.findElement(By.xpath("(//*[text()='Click me'])[4]"));
		click4.click();
		driver.switchTo().alert().sendKeys("Acceleration");
		driver.switchTo().alert().accept();
	}

}
