package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveTimePractices {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		  driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		  driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		  driver.findElement(By.cssSelector("#loginButton>div")).click();
		  Thread.sleep(4000);
	     driver.findElement(By.cssSelector("#logoutLink")).click();
		

	}

}
