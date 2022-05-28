package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day69DropDownAndMultiDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement addvertiesclik = driver.findElement(By.xpath("//img[@alt='adplus-dvertising']"));
		addvertiesclik.click();

// Single dropDown handle
//		WebElement coloreTextBox = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
//		coloreTextBox.click();
//	Select selectobj=new Select(coloreTextBox);
//	selectobj.selectByVisibleText("White");
//	coloreTextBox.click();
//	selectobj.selectByIndex(6);
//	coloreTextBox.click();
//	selectobj.selectByValue("6");
//	coloreTextBox.click();
//-------------------------------------------------------------------------------	

// multihandle dropDown handle

/*		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();

		WebElement multihandleDropDown = driver.findElement(By.id("cars"));
		
		// multihandleDropDown.click();
		
		Select multiSel = new Select(multihandleDropDown);
		multiSel.selectByVisibleText("Volvo");
		multiSel.selectByIndex(1);
		multiSel.selectByValue("opel");
		multiSel.selectByIndex(3);
		*/

//--------------------------------------------------------------------------------	
// 1st way
/*	WebElement colorddl=driver.findElement(By.id("oldSelectMenu"));
	Select sel=new Select (colorddl);
	List<WebElement>alloptions=sel.getOptions();
	for(int i=0; i<alloptions.size(); i++)
			{
				System.out.println(alloptions.get(i).getText());
			}
		sel.selectByVisibleText("Purple");
		
//-----------------------------------------------------------------------
		WebElement colorddl=driver.findElement(By.id("oldSelectMenu"));
		Select sel=new Select (colorddl);
		List<WebElement>objoption=sel.getOptions();
		for(int i=0; i<objoption.size(); i++)
		{
			System.out.println(objoption.get(i).getText());
		}
		sel.selectByIndex(4);
		*/
//-----------------------------------------------------------------------------------		
		
	}

}
