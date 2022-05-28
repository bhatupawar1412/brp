package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class goibibo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
	
		WebElement autosuggest=driver.findElement(By.xpath("(//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'])[1]"));
		autosuggest.click();
		
		//path
		//--(//div[@class='sc-fotOHu hmnmkS']//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'])[1]
				//--(//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'])[1]
				//--(//div[@class='sc-fotOHu hmnmkS']//p)[1]
				//--//*[contains(text(),'From')][1]
			  
		WebElement autosuggestwrite=driver.findElement(By.xpath("//input[@type='text']"));
		//Thread.sleep(2000);
		autosuggestwrite.sendKeys("PNQ");
	 
	//	List<WebElement> cityselect=driver.findElements(By.xpath("#autoSuggest-list"));
		List<WebElement>  cityselect = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		for(WebElement cityset:cityselect)
		{
			if(cityset.getText().equalsIgnoreCase("Pune (PNQ)"))
			{
				cityset.click();
			}
		}
	 
	 
	//	autosuggest.sendKeys("pune");
		//--(//div[@class='sc-fotOHu hmnmkS']//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'])[1]
		//--(//p[@class='sc-iJKOTD iipKRx fswWidgetPlaceholder'])[1]
		//--(//div[@class='sc-fotOHu hmnmkS']//p)[1]
		//--//*[contains(text(),'From')][1]
	  
	  
		//goibibo obj = new goibibo();
	//	obj.frmcty(driver);
		

	}

/*void frmcty(WebDriver driver) throws InterruptedException {
		
		
	/**	WebElement autosrch = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/input[1]"));
		// div [@class='sc-cidDSM dOEpbS']/input

		autosrch.click();
		autosrch.sendKeys("Pu");
		Thread.sleep(3000);
		List<WebElement> dpar = driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li"));
		System.out.println(dpar.size());
		Thread.sleep(3000);
		for (WebElement getcty : dpar) {
			if (getcty.getText().contains("Pune")) {
				Thread.sleep(3000);
				getcty.click();
				Thread.sleep(3000);
			}

		}**/
	
	

}
