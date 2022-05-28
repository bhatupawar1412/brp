package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class day70SelectANDdselectmethod {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement colorDDL = driver.findElement(By.id("cars"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,500)");
		Thread.sleep(2000);

		Select sel = new Select(colorDDL);
		for (int i = 0; i < sel.getOptions().size(); i++) {
			sel.selectByIndex(i);
		}
//		sel.deselectByVisibleText("Saab");
		sel.deselectAll();
		

	}
}
