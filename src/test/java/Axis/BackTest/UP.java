package Axis.BackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		
		WebElement upload = driver.findElement(By.xpath("//input[@name='filename']"));
		
		upload.sendKeys("C:\\Users\\DELL\\Pictures\\Screenshots");
		

	}

}
