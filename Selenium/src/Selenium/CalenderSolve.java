package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderSolve {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// WebDriverWait wait = new WebDriverWait(driver,10);

		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions/");

		WebElement cal = driver.findElement(By.xpath("//input[@id='travel_date']"));
		cal.click();
		Thread.sleep(2000);

		// while(!driver.findElement(By.xpath("//th [@class='datepicker-switch' and
		// contains(text (),'March ')]")).getText().contains("December 2023"))
		// //-->current month cha password ahe
		// Thread.sleep(4000);

		while (!driver.findElement(By.xpath("/html/body/div[7]/div[1]/table/thead/tr[1]/th[2]")).getText()
				.contains("December 2023")) // -->current month cha password ahe
		// Thread.sleep(4000);

		{
			driver.findElement(By.xpath("//body[1]/div[7]/div[1]/table[1]/thead[1]/tr[1]/th[3]")).click();// -> current month click means forward 																											

		}
		int day = driver.findElements(By.className("day")).size();
		for (int i = 0; i < day; i++) {
			String date = driver.findElements(By.className("day")).get(i).getText();
			System.out.println(date);

			if (date.equalsIgnoreCase("14")) {
				driver.findElements(By.className("day")).get(i).click();

			}
		}
		// driver.quit();
	}

}
