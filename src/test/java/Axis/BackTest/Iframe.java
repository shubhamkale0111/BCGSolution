package Axis.BackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Iframe {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/IFrame/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement newFrame = driver.findElement(By.xpath("//iframe[@id='frame']"));
		driver.switchTo().frame(newFrame);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id='div-main-nav']/div/ul/li[3]/a")).click();
		
		
	}

}
