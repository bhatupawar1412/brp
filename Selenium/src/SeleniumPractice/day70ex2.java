package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day70ex2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement fistDDL = driver.findElement(By.cssSelector("#withOptGroup .css-1hwfws3"));
		fistDDL.click();
		//fistDDL.sendKeys("Group 1,option 2");
		//fistDDL.sendKeys(Keys.ARROW_DOWN);
	//	fistDDL.sendKeys(Keys.ENTER);
		fistDDL.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		driver.findElement(By.xpath("//*[text()='Group 1,option 2]")).click();
	// fistDDL.click();
	}

}
