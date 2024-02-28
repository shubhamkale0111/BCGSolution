package Axis.BackTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(500,TimeUnit.MILLISECONDS);
		
		WebElement fordoubleclk=driver.findElement(By.xpath("//div[@id='double-click']"));
		Actions doubleclk=new Actions(driver);
		
		doubleclk.doubleClick(fordoubleclk).perform();
		
		//Drag and Drop
		
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions dragdrop=new Actions(driver);
		
		dragdrop.dragAndDrop(src, dest).perform();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0 , 600)", "");
		
		 //move to element
		 WebElement mov1 = driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
		 Actions act=new Actions(driver);
	
		 act.moveToElement(mov1).perform();	
		 driver.findElement(By.xpath("//*[@id='div-hover']/div[1]/div/a")).click();
		 
		 org.openqa.selenium.Alert alert = driver.switchTo().alert();
	        alert.accept();
	     
		
		 WebElement mov2 = driver.findElement(By.xpath("(//button[@class='dropbtn'])[2]"));
		
		
		 act.moveToElement(mov2).perform();	
		 driver.findElement(By.xpath("//*[@id='div-hover']/div[2]/div/a")).click();
		 org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
	        alert2.accept();
		
		 WebElement mov3 = driver.findElement(By.xpath("(//button[@class='dropbtn'])[3]"));
		
		 act.moveToElement(mov3).perform();	
		 //after mouse over there is link so for click it we write this
		 driver.findElement(By.xpath("//div[@id='div-hover']/div[3]/div/a[2]")).click();
		 //to handle alert
		 org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
	        alert3.accept();
		 //For hold
		 WebElement hold = driver.findElement(By.xpath("//div[@id='click-box']"));
		
		 act.clickAndHold(hold).perform();
		
		
		
		
}
}