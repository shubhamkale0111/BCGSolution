package Axis.BackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement chkboxes = driver.findElement(By.xpath("//div[@id='checkboxes']"));
		
		if(chkboxes.isEnabled()) {
			chkboxes.click();
			
		}
		
		WebElement chkbox1 = driver.findElement(By.xpath("//input[@type= 'checkbox'][1]"));
		
		if(chkbox1.isEnabled()) {
			chkbox1.click();
			
		}
		
		WebElement chkbox2 = driver.findElement(By.xpath("//label[contains(text(),'Option 2')]"));
		
		if(chkbox2.isEnabled()) {
			chkbox2.click();
			
		}
	

	}

	}
