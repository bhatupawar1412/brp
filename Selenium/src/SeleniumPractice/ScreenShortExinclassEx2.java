package SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShortExinclassEx2 {

	public static void main(String[] args) throws IOException {
		


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");
        
        File File=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Files.copy(File,new File("C:\\Users\\Admin\\Pictures\\screenshot.ss"));

	}

}
