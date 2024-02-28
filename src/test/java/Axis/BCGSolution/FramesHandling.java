package Axis.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));

		driver.switchTo().frame(frame1);

		WebElement content = driver.findElement(By.id("tinymce"));

		content.clear();

		content.sendKeys("hello world");
		
		
	}

}
