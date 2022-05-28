package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class1SelLocalHost {

	void method1(WebDriver driver, WebDriverWait wait) {
		// web page
		driver.get("http://localhost:3000/");

		// title page
		driver.getTitle();

		driver.manage().window().maximize();

	}

	void m2(WebDriver driver) {
		WebElement UILink = driver.findElement(By.xpath("//div[contains(text(),'UI Automation Testing')]"));
		UILink.click();

	}

	void m3(WebDriver driver) {
		WebElement user = driver.findElement(By.xpath("//body/div[@id='root']/div[1]/form[1]/div[1]/div[1]/input[1]"));

		user.sendKeys("suhas.awale");

		WebElement password = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/form[1]/div[1]/div[2]/input[1]"));
		password.sendKeys("suhas@123");
		user.click();

		WebElement Login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Login.click();
	}

	void m4(WebDriver driver) {
		WebElement textmsg = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/input[1]"));
		textmsg.sendKeys("RadheKrisha");

		WebElement textnum = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/input[1]"));
		textnum.sendKeys("414");

	}

	void m5(WebDriver driver) throws Exception {
		WebElement select = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
		select.click();

		Select objdropdown = new Select(select);
		objdropdown.selectByIndex(3);
		Thread.sleep(1000);

		objdropdown.selectByValue("option2");
		Thread.sleep(1000);

		objdropdown.selectByVisibleText("Option 4");

	}

	void m6(WebDriver driver) {
		WebElement checkbox1 = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/input[1]"));
		checkbox1.click();

		WebElement checkbox2 = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/div[3]/input[1]"));
		checkbox2.click();

		WebElement checkbox3 = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[2]/div[2]/div[4]/input[1]"));
		checkbox3.click();

		WebElement redio2 = driver.findElement(By.xpath("//input[@id='radio2']"));
		redio2.click();
	}

	void popup(WebDriver driver) throws Exception {
		WebElement popupdriver = driver
				.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[3]/div[3]/input[1]"));
		popupdriver.sendKeys("pop up");

		WebElement alertbtn = driver.findElement(By.xpath("//button[contains(text(),'Alert')]"));
		alertbtn.click();
		Thread.sleep(2000);

//handling pop up in selenium

		driver.switchTo().alert().accept();
	}

	public static void main(String[] args) throws Exception {

		Class1SelLocalHost obj = new Class1SelLocalHost();

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Selenium Dependancies\\\\Selenium Dependancies\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		obj.method1(driver, wait);
		obj.m2(driver);
		obj.m3(driver);
		obj.m4(driver);
		// obj.m5(driver);
		// obj.m6(driver);
		obj.popup(driver);
	}

}
