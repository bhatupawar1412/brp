package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoqaPopUpsolve {

	void OpenWebPage(WebDriver driver, WebDriverWait wait) {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

	}

	void handleAlerte(WebDriver driver) throws InterruptedException {

		WebElement seealert = driver.findElement(By.xpath("//button[@id='alertButton']"));
		seealert.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		WebElement fivesecalert = driver.findElement(By.xpath("//button [@id='timerAlertButton']"));
		fivesecalert.click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		WebElement confirmbox = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		confirmbox.click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		confirmbox.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		WebElement promotebox = driver.findElement(By.xpath("//button[@id='promtButton']"));
		promotebox.click();
		Thread.sleep(3000);
		driver.switchTo().alert().sendKeys("Acceleration");
		// promotebox.sendKeys("acc"); // wrong
		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

	void Element(WebDriver driver) {
		WebElement Element = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]"));
		Element.click();

	}

	void Textbox(WebDriver driver) throws Exception {
		WebElement textbox = driver.findElement(By.xpath("//span[contains(text(),'Text Box')]"));
		Thread.sleep(2000);
		textbox.click();
		Thread.sleep(2000);

		WebElement fullname = driver.findElement(By.xpath("//input[@id='userName']"));
		fullname.sendKeys("Rajkumar Rajiv pkSing");
		Thread.sleep(2000);

		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("Rajkumar44@gmail");
		Thread.sleep(2000);

		WebElement currentaddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		currentaddress.sendKeys("A/p gully number 420, rajkumar nagar,near by kadak station");
		Thread.sleep(2000);

		WebElement confirmaddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		confirmaddress.sendKeys("A/p gailly number 420, rajkumar nagar,near by kadak station");
		Thread.sleep(2000);

		WebElement submit = driver.findElement(By.xpath("//button [@id='submit']"));
		// submit.click();
	}

	void checkbox(WebDriver driver) throws Exception {
		WebElement checkbox = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		checkbox.click();
		Thread.sleep(4000);

		WebElement plussign = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]"));
		plussign.click();
		Thread.sleep(4000);

		WebElement homeclk = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]"));
		homeclk.click();

	}

	void rediobutton(WebDriver driver) throws Exception {

		WebElement buttonclk = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]"));
		buttonclk.click();
		Thread.sleep(4000);
		WebElement yesclk = driver.findElement(By.xpath("//*[@for='yesRadio']"));
		yesclk.click();
	}

	void Webtable(WebDriver driver) throws Exception {
		WebElement WebTable = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		WebTable.click();

		WebElement search = driver.findElement(By.xpath("//input[@id='searchBox']"));
		search.sendKeys("Kierra");
		Thread.sleep(4000);
		search.clear();

		search.sendKeys("Cierra");
		Thread.sleep(4000);
		// search.clear();
		WebElement cierra = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/span[1]/*[1]"));
		cierra.click();
		Thread.sleep(4000);

		WebElement crossSyb = driver.findElement(By.xpath("//span[contains(text(),'×')]"));
		crossSyb.click();

	}

	void closeElement(WebDriver driver) throws Exception {

		// Thread.sleep(4000);
		// driver.close();
		WebElement Element = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]"));
		Thread.sleep(4000);
		Element.click();

	}

	void Forms(WebDriver driver) throws Exception {

		WebElement formclk = driver.findElement(By
				.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]/div[1]"));
		Thread.sleep(2000);
		formclk.click();

	}

	void practceform(WebDriver driver) {
		WebElement practcefrm = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]"));
		practcefrm.click();

		// click calendar
		WebElement calender = driver.findElement(
				By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[1]"));
		calender.click();

		// year
		WebElement Year = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
		Year.click();

		Select year = new Select(Year);
		year.selectByValue("1996");
		Year.click();

		// month
		WebElement DateMonthclk = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
		DateMonthclk.click();

		Select DMclk = new Select(DateMonthclk);

		DMclk.selectByIndex(11);

		// date
		WebElement Date = driver.findElement(By.xpath("//div[contains(text(),'14')]"));
		Date.click();
	}

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebDriverWait wait = new WebDriverWait(driver, 20);

		demoqaPopUpsolve obj = new demoqaPopUpsolve();
		obj.OpenWebPage(driver, wait);
		obj.handleAlerte(driver);

		obj.Element(driver);
		obj.Textbox(driver);
		obj.checkbox(driver);
		obj.rediobutton(driver);
		obj.Webtable(driver);
		obj.closeElement(driver);
		obj.Forms(driver);
		obj.practceform(driver);

	}

}
