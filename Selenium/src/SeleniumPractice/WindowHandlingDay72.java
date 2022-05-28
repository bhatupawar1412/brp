package SeleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDay72 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");

		driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();

		driver.findElement(By.id("windowButton")).click();

		Set<String> allWindow = driver.getWindowHandles();
		Iterator<String> itr = allWindow.iterator();

		String parentwindow = itr.next();
		System.out.println("id1 :" + parentwindow);
		String childwindow = itr.next();
		System.out.println("id2 :" + childwindow);

		driver.switchTo().window(childwindow);
		String newURL = driver.getCurrentUrl();
		System.out.println("New URl :" + newURL);
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		String text = ele.getText();
		System.out.println("text :" + text);
		Thread.sleep(2000);
		
		//driver.close();// close the browser currently pointed by driver
		
		driver.quit();// close all instance opened by the driver
		
		String url2=driver.getCurrentUrl();
		System.out.println("url2 :"+url2);
		
		
	}
}
