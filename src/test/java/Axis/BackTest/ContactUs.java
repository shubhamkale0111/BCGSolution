package Axis.BackTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdriveruniversity.com/");
		
		
		driver.findElement(By.xpath("//h1[text()='CONTACT US']")).click();
		Thread.sleep(2000);
		
// contact us page
		
		
	String main = driver.getWindowHandle();
		
	
		
		
		Set<String> texts = driver.getWindowHandles();
		System.out.println(texts);
		for(String w1: texts) {
			
			if(!w1.equals(main)) {
				Thread.sleep(2000);
				driver.switchTo().window(w1);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Shubham");
				driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Kale");
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Shubh11@gmail.com");
				driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("djvdevgyugeucg");
				driver.findElement(By.xpath("//input[@type='submit']")).click();
			}
		}
		
		
	}

}