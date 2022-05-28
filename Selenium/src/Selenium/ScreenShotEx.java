package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotEx {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
       // TakesScreenshot take_screenshot = (TakesScreenshot) driver;
    /*    File src=take_screenshot.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,new  File("C:\\Users\\Admin\\Desktop/sc"));
        */
    WebElement development=driver.findElement(By.xpath("//*[@id=\"menu-top\"]/li[5]/a"));    
	
//	File dev_file=development.getScreenshotAs(OutputType.FILE);
    File File=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(File, new File("C:\\Users\\Admin\\Pictures\scrdev1.pp"));
	
	
	
	
	
	
	
	}

}
