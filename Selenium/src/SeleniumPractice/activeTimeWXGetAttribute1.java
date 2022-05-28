package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activeTimeWXGetAttribute1 {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		/*
		 * WebElement unfild=driver.findElement(By.id("username")); String
		 * namevalue=unfild.getAttribute("name"); String
		 * placeHolderValue=unfild.getAttribute("placeholder");
		 * System.out.println("nameValue ="+namevalue);
		 * System.out.println("placeHolderValue ="+placeHolderValue);
		 */
		// -----------------------------------------------------------------------------------
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		// verify default tab
		WebElement timeTrack = driver.findElement(By.xpath("//a[div[text()='TIME-TRACK']]"));
		if (timeTrack.getAttribute("class").contains("selected")) {
			System.out.println("Time track tab is Not selected.");
		} else {
			System.out.println("Time track tab is not selected.");
		}
		// click on task tab
		WebElement taskTab = driver.findElement(By.xpath("//a[div[text()='TASKS']]"));
		taskTab.click();
		taskTab=driver.findElement(By.xpath("//a[div[text()='TASKS']]"));
		if (taskTab.getAttribute("class").contains("selected")) {
			System.out.println("Task tab is selected.");
		} else {
			System.out.println("Task tab is not selected.");
		}

		// -----------------------------------------------------------------------------------

	/*	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
		driver.findElement(By.cssSelector("#loginButton>div")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("#logoutLink")).click();
		List<WebElement> tabslinks = driver.findElements(By.xpath("//td[starts-with(@class,'navItem')]/a"));
		List<WebElement> texttabs = driver.findElements(By.xpath("//td[starts-with(@class,'navItem')]/a/div[1]"));
		for (int i = 0; i < tabslinks.size(); i++) {
			String txt = tabslinks.get(i).getAttribute("class");
			if (txt.contains("selected")) { // i=0
				System.out.println(texttabs.get(i).getText());
			}
		}
*/
	}
}
