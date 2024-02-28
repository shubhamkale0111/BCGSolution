package Axis.BackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
		 
		Select sel = new Select(dropdown);
 
		// select by visible text
 
		sel.selectByVisibleText("Maven");
 
		Thread.sleep(1000);
 
		// select by value
 
		sel.selectByValue("testng");
		
		Thread.sleep(1000);
 
		// select by indexing
 
		sel.selectByIndex(3);

	}

}
