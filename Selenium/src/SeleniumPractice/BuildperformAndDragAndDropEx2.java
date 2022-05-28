package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuildperformAndDragAndDropEx2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/droppable");

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		Actions action = new Actions(driver);
		// way 1
		 action.dragAndDrop(source, target).perform();
		// .perform(); asa karu shakto but single opration karta jast karun apan
		// .build().perform(); used karto
		// ----------------------------------------------------------
		// way 2
		// action.dragAndDrop(source, target).build().perform();
		// -----------------------------------------------------------
		// way 3
		// action.dragAndDropBy(source, 250, 90).build().perform(); //250 x-axis &
		// y-axis 80
		// -------------------------------------------------------------------
	//	action.clickAndHold().moveToElement(target).release().build().perform();
		Thread.sleep(4000);
		driver.close();

	}
}
