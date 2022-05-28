package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuildperformAndDragAndDropEx1 {
	
public static void main(String[] args) {
	

	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver ();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/frames");
	WebElement Frame1=driver.findElement(By.id("frame1"));
	System.out.println(Frame1);
	driver.switchTo().frame(Frame1);//way 1 WebElement
//	driver.switchTo().frame(1); //way 2 index
	//driver.switchTo().frame("frame1"); // name or id	
	
	WebElement framesamplPage=driver.findElement(By.id("sampleHeading"));
	System.out.println(framesamplPage.getText());
	driver.switchTo().defaultContent();
	driver.switchTo().frame("frame2");
	framesamplPage=driver.findElement(By.id("sampleHeading"));
	System.out.println(framesamplPage.getText());
	driver.switchTo().defaultContent();
	
}
}
