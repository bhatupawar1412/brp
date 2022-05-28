package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusCalenderEx1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		WebElement dateclik=driver.findElement(By.xpath("//input[@id='onward_cal']"));
		dateclik.click();
		
		while(!driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText().contains("Apr 2022"))
		{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		}
		
	
		//*[@class='wd day' or  @ class='we day']
 	
		int day=driver.findElements(By.xpath("//*[@class='wd day' or  @ class='we day']")).size();
		////td[starts-with(@class,'w')] ha pn usded karu shakto
		for(int i=0; i<day; i++)
		{
			String date=driver.findElements(By.xpath("//*[@class='wd day' or  @ class='we day']")).get(i).getText();
			System.out.println(date);
			
			if(date.equalsIgnoreCase("30"))
			{
				driver.findElements(By.xpath("//*[@class='wd day' or  @ class='we day']")).get(i).click();
			}
		}
		
		// hard code no used 
		/*	int day=driver.findElements(By.xpath("//td[contains(text(),'16')]")).size();
			
			for(int i=0; i<day; i++)
			{
				//String date=driver.findElements(By.className("wd day")).get(i).getText();
				String date=driver.findElements(By.xpath("//td[contains(text(),'16')]")).get(i).getText();
				System.out.println(date);
				
				if(date.equalsIgnoreCase("16"))
				{
					driver.findElements(By.xpath("//td[contains(text(),'16')]")).get(i).click();
				}
			} */
			
		
	}

}
