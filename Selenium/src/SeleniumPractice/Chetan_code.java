package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Chetan_code {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Registration Page

		//driver.get("https://testolao.cvlindia.com");
		
		//Registration Page

				driver.get("https://testolao.cvlindia.com");

				driver.findElement(By.id("Button4")).click(); 
		 
				driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul/li[2]/a")).click();
				
				
				driver.findElement(By.xpath("//*[@id=\"txtTorcode\"]")).sendKeys("S00041008");
				
				Thread.sleep(15000);
				
				driver.findElement(By.id("btnSubmitExisting")).click();
				
				try
				{
					driver.switchTo().alert().accept();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
				
				Thread.sleep(30000);
		    	WebElement element = driver.findElement(By.xpath("(//label[contains(text(),'No')])[1]"));
		        JavascriptExecutor js = (JavascriptExecutor)driver;
		        js.executeScript("arguments[0].click();",element);
		        
		        
		        ((WebElement)driver.findElement(By.id("btnBrokeragePlan"))).click();
				
				   driver.findElement(By.id("select_2_A")).click();
		 
		        
		        
		        
		        WebElement SELECT = driver.findElement(By.id("ddlBrkGrossAnnualIncome"));
		        SELECT.click();
				
				Select sh = new Select(SELECT);
		        
		        //sh.selectByIndex(1);
		        //Thread.sleep(3000);
		        
		        sh.selectByValue("2");
		        Thread.sleep(3000);
		        
//		        sh.selectByIndex(1);
//		        Thread.sleep(3000);
//		        
//		        sh.selectByIndex(1);
//		        Thread.sleep(3000);
		        
		        WebElement Segment = driver.findElement(By.xpath("//*[@id='lblSegmentType']/div/button/span[1]"));
		        Segment.click();
		        
		        Select SegmentType = new Select(driver.findElement(By.xpath("//*[@id=\"ddlSegmentType\"]")));
		        SegmentType.selectByValue("2");
		        SegmentType.selectByValue("6");
		        SegmentType.selectByValue("7");
		       // ((WebElement) SegmentType).click();
		        Thread.sleep(3000);
		               
		   
		        WebElement button_save = driver.findElement(By.xpath("//*[@id=\"broking-tab\"]/div[2]/button"));
		        
		        js.executeScript("arguments[0].scrollIntoView(true)",button_save); 
		       
		        // Calender Handle 
		       
		         WebElement dateclik= driver.findElement(By.id("txtBrkGrossAnnualIncomeAsOn"));
				dateclik.click();

				while(!driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/thead/tr[1]/th[2]")).getText().contains("March 2022"))
				//while(!driver.findElement(By.xpath("html/body/ul[16]")).getText().contains("March 2022"))
				{
				driver.findElement(By.className("prev")).click();
					//driver.findElement(By.xpath("/html/body/div[11]/div[1]/table/thead/tr[1]/th[1]")).click();
				}
		        ///html/body/ul[16] 
				///html/body/div[11]/div[1]/table/thead/tr[1]/th[1]
				int day=driver.findElements(By.xpath("//*[@class='day']")).size();
				
				for(int i=1; i<day-1; i++)
			    //	for(int i=day-1; i>=0; i--)
				{
					String date=driver.findElements(By.xpath("//*[@class='day']")).get(i).getText();

					if(date.equalsIgnoreCase("10"))
					{
						driver.findElements(By.xpath("//*[@class='day']")).get(i).click();
				 }
				}
				
				Thread.sleep(3000);
				
				js.executeScript("arguments[0].click();",button_save);
				
				System.out.println("hello");
				
				
		        driver.findElement(By.cssSelector(".active.day")).click();
		        
		        WebElement planButton= driver.findElement(By.id("btnDPPlan"));
		        
		    	js.executeScript("arguments[0].click();",planButton);
		       
				driver.switchTo().activeElement();
				driver.findElement(By.id("select_5_S1")).click();
				
				WebElement planButton1= driver.findElement(By.xpath("//*[@id=\"dp-tab\"]/div[2]/button"));
				
				js.executeScript("arguments[0].click();",planButton1);
				
				driver.findElement(By.id("txtDivIFSC")).sendKeys("SBIN0000278");
				
				driver.findElement(By.id("txtAccNumb")).sendKeys("SBIN0000278");
				
		        WebElement planButton2= driver.findElement(By.xpath("//*[@id=\"bank-tab\"]/div[2]/button"));
				
				js.executeScript("arguments[0].click();",planButton2);
				
				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"nomination-tab\"]/div[2]/div/div[1]/div[2]/div/div/label[2]"));
		        JavascriptExecutor js1 = (JavascriptExecutor)driver;
		        js1.executeScript("arguments[0].click();",element1);
		        
		        WebElement planButton3= driver.findElement(By.xpath("//*[@id=\"nomination-tab\"]/div[2]/button"));
				
				js.executeScript("arguments[0].click();",planButton3);
				
				WebElement SELECT1 = driver.findElement(By.id("ddlFaSpFlag"));
		        SELECT1.click();
				
				Select sh1 = new Select(SELECT1);
				sh1.selectByValue("1");
		        Thread.sleep(3000);
		        driver.findElement(By.id("txtFaSpFName")).sendKeys("Appasaheb");
		        driver.findElement(By.id("txtFaSpLName")).sendKeys("Lad");
		        
		        
		        WebElement SELECT2 = driver.findElement(By.id("ddlMartialStat"));
		        js.executeScript("arguments[0].scrollIntoView(true)",SELECT2);
		        SELECT2.click();
				Select sh2 = new Select(SELECT2);
				sh2.selectByValue("2");
				 Thread.sleep(3000);
				 
				 
			    WebElement SELECT3 = driver.findElement(By.id("ddlOccupation"));  
		        SELECT3.click();
		        Select sh3 = new Select(SELECT3);
		    	sh3.selectByValue("2");
		    	Thread.sleep(3000);
				 
		    	 WebElement planButton4= driver.findElement(By.xpath("//*[@id=\"basic-tab\"]/div[2]/button"));
		 		
		 	     js.executeScript("arguments[0].click();",planButton4); 
		 		
		         WebElement planButton5= driver.findElement(By.xpath("//*[@id=\"contact-tab\"]/div[2]/button"));
		 		
		 		 js.executeScript("arguments[0].click();",planButton5);
		 		
		 		 WebElement planButton6= driver.findElement(By.xpath("//*[@id=\"fatca-tab\"]/div[2]/button"));
		  		
		  	   	js.executeScript("arguments[0].click();",planButton6);
		  	   	
		  	    Thread.sleep(80000);
		  	    WebElement planButton7= driver.findElement(By.xpath("//*[@id=\"document-tab\"]/div[2]/button"));
				
			   	js.executeScript("arguments[0].click();",planButton7);
			   	
			   	WebElement Email = driver.findElement(By.name("otpIdent"));
			   	Email.click();
			    Thread.sleep(30000);
				
		        WebElement planButton8= driver.findElement(By.xpath("//*[@id=\'btnFinish\']"));
				
			   	js.executeScript("arguments[0].click();",planButton8);
			   	
			   	WebElement Declaration = driver.findElement(By.id("chkDeclare"));
				Declaration.click();
		        WebElement planButton9= driver.findElement(By.xpath("//*[@id=\"btnConfirmPreview\"]"));
				
			   	js.executeScript("arguments[0].click();",planButton9);
			   	Thread.sleep(30000);
			   	
		      	//WebElement Declaration1 = driver.findElement(By.id("chkDeclare"));
				//Declaration1.click();
				
				System.out.println(driver.getTitle());
			
		

		  
		

	}

}
