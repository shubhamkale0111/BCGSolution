package Axis.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.dummypoint.com/seleniumtemplate.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		 
		Select sel = new Select(dropdown);
 
		// select by visible text
 
		sel.selectByVisibleText("Option3");
 
		Thread.sleep(1000);
 
		// select by value
 
		sel.selectByValue("OptionFive");
		
		Thread.sleep(1000);
 
		// select by indexing
 
		sel.selectByIndex(1);

	}

}
