package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderEx3DoublePage {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		
		driver.findElement(By.name("source")).sendKeys("Delhi,Delhi");
		driver.findElement(By.name("destination")).sendKeys("Mum");
		driver.findElement(By.xpath("//span[contains(text(),'Mumbai,Mumbai - India')]")).click();
		
	driver.findElement(By.className("calendar-icon")).click();	

	while(!driver.findElement(By.xpath("//*[@id=\"depart-cal\"]/div[3]/div[1]/span[2]")).getText().contains("Jun 2022"))
		
	
	{
		driver.findElement(By.xpath("//*[@id=\"depart-cal\"]/div[4]/div[1]/span[3]")).click();
		
	}
	
	int day =driver.findElements(By.xpath("//*[@class='vc-cell ']")).size();
	
	for(int i=0; i<day; i++)
	{
		
		String date=driver.findElements(By.xpath("//*[@class='vc-cell ']")).get(i).getText();
		
		System.out.println(date);
		if(date.equalsIgnoreCase("15"))
		{
			driver.findElements(By.xpath("//*[@class='vc-cell ']")).get(i).click();
		}
	}
	//---------------------------
	//return
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='element return-element']")).click();
	
	while(!driver.findElement(By.xpath("//*[@id=\"return-cal\"]/div[3]/div[1]/span[2]")).getText().contains("Nov 2022"))
		
		
	{
		driver.findElement(By.xpath("//*[@id=\"return-cal\"]/div[4]/div[1]/span[3]")).click();
		
	}
	
	int day1 =driver.findElements(By.xpath("//*[@class='vc-cell ']")).size();
	
	for(int i=0; i<day1; i++)
	{
		
		String date1=driver.findElements(By.xpath("//*[@class='vc-cell ']")).get(i).getText();
		
		System.out.println(date1);
		if(date1.equalsIgnoreCase("16"))
		{
			driver.findElements(By.xpath("//*[@class='vc-cell ']")).get(i).click();
		}
	}
	
	
	/*	int day =driver.findElements(By.xpath("//*[@class='vc-cell ']")).size();
	
	System.out.println(day);
	
	for(int i=1; i<day; i++)
	{
		String date=driver.findElements(By.xpath("//*[@class='vc-cell ']")).get(i).getText();

	System.out.println(date);
	if(date.equalsIgnoreCase("15"))
	{
		driver.findElements(By.xpath("//*[@class='vc-cell ']")).get(i).click();
	}
	}
	
	*/   
	
	
	
	
	
	
	

}}
