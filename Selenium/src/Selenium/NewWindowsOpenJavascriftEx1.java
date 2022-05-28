package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowsOpenJavascriftEx1 {
	WebDriver driver;

	public void newtap() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement newpage=driver.findElement(By.name("q"));
		newpage.sendKeys("MS Dhoni");
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.open()");
	}

	public static void main(String[] args) {

		NewWindowsOpenJavascriftEx1 obj = new NewWindowsOpenJavascriftEx1();
		obj.newtap();

	}

}
