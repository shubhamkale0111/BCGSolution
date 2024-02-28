package Axis.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement doubleclick = driver.findElement(By.xpath("//input[@id='double-click']"));
		
		Actions builder = new Actions(driver);
		
		builder.doubleClick(doubleclick).perform();
		
		//informational alerts
		
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		alt.accept();
		
		builder.contextClick(doubleclick).perform();

	}

}
