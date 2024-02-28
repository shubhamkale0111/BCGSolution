package Axis.BackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
		
		driver.manage().window().maximize();
		
		
		WebElement Date = driver.findElement(By.xpath("//div[@id='datepicker']"));
		
		Thread.sleep(2000);
		
		Date.click();
		
		Thread.sleep(1000);
		
		WebElement newDate = driver.findElement(By.xpath("//td[contains(text(),'26')]"));
		newDate.click();
		

	}

}
