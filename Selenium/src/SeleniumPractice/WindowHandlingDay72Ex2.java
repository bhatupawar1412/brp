package SeleniumPractice;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDay72Ex2 {
	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/browser-windows");

	driver.findElement(By.xpath("//img[@alt='adplus-dvertising']")).click();

	driver.findElement(By.id("windowButton")).click();

	String parentwindow=driver.getWindowHandle();
	
	Set<String> Window=driver.getWindowHandles();
	Iterator<String>itr=Window.iterator();

	String text="";
	while(itr.hasNext())
	{
		String id1=itr.next();
		if(!parentwindow.equals(id1))
		{
			driver.switchTo().window(id1);
		List<WebElement> ele= driver.findElements(By.id("sampleHeading"));
		
		if(! ele.isEmpty())
		{
			text=ele.get(0).getText();
			System.out.println("text :"+text);
			break;
		}
		}
	}
	
	driver.quit(); 
	
}
}
