package Axis.BackTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Radio_CheckBox_Dropdown {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		//For dropdown
		 Thread.sleep(1000);
			WebElement dropdown=driver.findElement(By.xpath("//*[@id='dropdowm-menu-1']"));
			 Thread.sleep(1000);
			Select drop =new Select(dropdown);
			drop.selectByValue("python");
			 Thread.sleep(1000);
		Select drop2=new Select	(driver.findElement(By.xpath("//*[@id='dropdowm-menu-2']")));
			 	drop2.selectByVisibleText("Maven");
			 	Thread.sleep(1000);
			
			 Select drop3=new Select(driver.findElement(By.xpath("//*[@id='dropdowm-menu-3']")));
					 drop3.selectByVisibleText("CSS");
					 Thread.sleep(1000);
					 
					// driver.quit();
					
					 //checkbox
					 
		WebElement chkbox=	driver.findElement(By.xpath("//*[@id='checkboxes']/label[3]/input"));
		 Thread.sleep(1000);
		if(chkbox.isSelected()) {
			chkbox.click();
		}
		 Thread.sleep(1000);
		WebElement chkbox1=	driver.findElement(By.xpath("//*[@id='checkboxes']/label[1]/input"));
		if(chkbox1.isEnabled()) {
			chkbox1.click();
		}
		Thread.sleep(1000);
		
			//---Multipl Radio Button---//
		
		List<WebElement>radioli=driver.findElements(By.xpath("//input[@name='color']"));
		Thread.sleep(300);
		for(WebElement wb:radioli) {
			Thread.sleep(500);
			wb.click();			
		}
	}
}
