package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameDroppableWeb {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	
	WebElement source = driver.findElement(By.id("draggable"));
	
	WebElement target = driver.findElement(By.id("droppable"));
	
	Actions actobj = new Actions(driver);
	actobj.dragAndDrop(source, target).build().perform();
	
	driver.switchTo().defaultContent(); //it will get back to main window/ control goes back to main window 
	
	WebElement textBox = driver.findElement(By.name("s"));
	textBox.sendKeys("textbox");
	
	}

}
