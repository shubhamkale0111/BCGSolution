package Axis.BackTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoList {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
        Thread.sleep(800);
        driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
        Actions actions = new Actions(driver);
        Thread.sleep(800);
        WebElement AddNewTodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
        actions.moveToElement(AddNewTodo).perform();
        Thread.sleep(800);
        AddNewTodo.sendKeys("Contact Us");
        AddNewTodo.sendKeys(Keys.ENTER);
        Thread.sleep(800);
        AddNewTodo.sendKeys("Login Function");
        AddNewTodo.sendKeys(Keys.ENTER);
        Thread.sleep(800);
        AddNewTodo.sendKeys("AddSignUp");
        AddNewTodo.sendKeys(Keys.ENTER);
        Thread.sleep(800);
        
        WebElement Delpracticemagic = driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[3]/span/i"));
        actions.moveToElement(Delpracticemagic).perform();
        Delpracticemagic.click();
        
        WebElement Plusicon = driver.findElement(By.xpath("//i[@id='plus-icon']"));
        actions.moveToElement(Plusicon).perform();
        Thread.sleep(800);
        Plusicon.click();	        
	}  
}


