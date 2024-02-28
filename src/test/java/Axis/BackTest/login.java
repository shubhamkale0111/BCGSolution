package Axis.BackTest;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class login {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
driver.get("https://webdriveruniversity.com/");
		
		// login page

		driver.manage().window().maximize();

		
		WebElement contact = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
		contact.click();
		Thread.sleep(1000);
		
		// find current Window
		String currentWin = driver.getWindowHandle();
		
		// list all windows
		Set<String> childwindow = driver.getWindowHandles();
		System.out.println(childwindow);
		for(String win : childwindow)
			
			// check current window is selected window 
			if (!win.equals(currentWin))	
			{
				// if not current window , then switch to selected window
				driver.switchTo().window(win);
				Thread.sleep(1000);
				WebElement  username = driver.findElement(By.xpath("//input[@id='text']"));
				WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
				WebElement login = driver.findElement(By.xpath("//button[@id='login-button']"));
		
				Thread.sleep(1000);
		
				username.sendKeys("webdriver");
				Thread.sleep(500);
				password.sendKeys("webdriver123");
				Thread.sleep(500);
				login.click();
				Thread.sleep(500);
				
				Alert al = driver.switchTo().alert();
				System.out.println(al.getText());
				al.accept();
	}
		
	
		}
	
}