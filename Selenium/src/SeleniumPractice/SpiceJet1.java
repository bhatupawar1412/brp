package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");

		driver.manage().window().maximize();
		
		WebElement autosuggest = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div[1]/div[2]/input"));
		autosuggest.sendKeys("Mum");

		List<WebElement> stateclick = driver.findElements(By.xpath("//div[@class='css-1dbjc4n']"));

		for (WebElement stategoa : stateclick) {
			if (stategoa.getText().equalsIgnoreCase("Mumbai")) {
				Thread.sleep(4000);
				stategoa.click();
				Thread.sleep(4000);
			}
		}

		WebElement autosuggest1 = driver.findElement(
				By.xpath("//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[3]/div/div[3]/div[1]/div[2]/input"));
		autosuggest1.sendKeys("Be");

		List<WebElement> citynashik = driver.findElements(By.xpath("//div[@class='css-1dbjc4n r-18u37iz']"));

		for (WebElement city : citynashik) {
			if (city.getText().equalsIgnoreCase("Belagavi")) {
				Thread.sleep(4000);
				city.click();
				Thread.sleep(4000);
			}
		}

		// -----------------------------------------------------------------------------------------------------
		// Calendar

		/*
		 * WebElement calender=driver.findElement(By.xpath(
		 * "//body/div[@id='react-root']/div[@id='main-container']/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]"
		 * ));
		 * 
		 * calender.click(); Thread.sleep(4000);
		 * 
		 * while(!driver.findElement(By.xpath(
		 * "//*[@id=\"main-container\"]/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/div"
		 * )).getText().contains("June 2022")) { Thread.sleep(4000);
		 * driver.findElement(By.xpath(
		 * "/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[4]/div/div[2]/div[2]/div[1]/svg/g/circle"
		 * )).click();
		 * 
		 * }
		 * 
		 * int day=driver.findElements(By.xpath("")).size();
		 * 
		 * for(int i=0; i<day; i++) {
		 * 
		 * }
		 */

	}

}
