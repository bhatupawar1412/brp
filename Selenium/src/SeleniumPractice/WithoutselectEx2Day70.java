package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutselectEx2Day70 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		 //js.executeScript("window.scrollBy(0,200)");

		WebElement fistsel = driver
				.findElement(By.xpath("//div[p[b[text()='Multiselect drop down']]]//div[@class=' css-1hwfws3']"));
		fistsel.click();
		js.executeScript("arguments[0].scrollIntoView()",fistsel);
		System.out.println(driver.getPageSource());
		
		
	}
}
