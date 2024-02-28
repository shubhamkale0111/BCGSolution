package Axis.BackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrool {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		driver.manage().window().maximize();
		Thread.sleep(700);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0 , 600)", "");
		 Thread.sleep(700);
		 js.executeScript("window.scrollBy(0 , -600)", "");
		 Thread.sleep(1000);
		 
		 //scroll still web element mention
		 WebElement scroll=driver.findElement(By.xpath("//div[@id='zone4']"));
		 js.executeScript("arguments[0].scrollIntoView(true);", scroll);
	
}
}
