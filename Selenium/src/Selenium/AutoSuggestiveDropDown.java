package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	           WebDriver driver = new ChromeDriver();
	          
	           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	           
	          // WebDriverWait wait= new WebDriverWait(driver, 10);
	
	       
	           driver.manage().window().maximize(); 
	           driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	            
	           String country ="Japan";
	           String searchCountry ="Ja";
	           
	          WebElement autoSearch= driver.findElement(By.id("autosuggest"));
	          autoSearch.sendKeys(searchCountry);
	      //  Thread.sleep(4000);
	          
	        //  List<WebElement> Selectcountry =driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
	          
	          List<WebElement> Selectcountry =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
	          
	          for(WebElement clickOncountry :Selectcountry)
	          {
	        	
	        	  if( clickOncountry.getText().equalsIgnoreCase(country))
	        	  {
	        		  Thread.sleep(4000);
	        		  
	        		  clickOncountry.click();
	        		  
	        		  
	        	  }
	          }

	}

}
