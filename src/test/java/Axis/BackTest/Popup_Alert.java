package Axis.BackTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup_Alert {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS); // Adjust time as needed
      
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
       
       WebElement ClickMe1 = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
        
       ClickMe1.click();
      
       org.openqa.selenium.Alert alert = driver.switchTo().alert();
        alert.accept();
        
       
        WebElement ClickMe2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
       Thread.sleep(500);
        
        ClickMe2.click();
       
        WebElement Close = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/div[3]/button")); 
        Close.click();
   
        WebElement ClickMe3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
        
        ClickMe3.click();
        
      
      
		WebElement clickme=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/span[1]/p[1]"));
		clickme.click();
      
		
		
		
		WebElement ajaxclose=driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button"));
		
		ajaxclose.click();
    
		driver.navigate().back();
		
  
        WebElement ClickMe4 = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
        
        ClickMe4.click();
        org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
        alert2.accept();
        WebElement ClickMe4a = driver.findElement(By.xpath("//*[@id=\"button4\"]"));
        
        ClickMe4a.click();
        org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
        
        alert3.dismiss(); 
         
	}
	
}
