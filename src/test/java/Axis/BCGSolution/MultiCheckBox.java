package Axis.BCGSolution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		driver.manage().window().maximize();
		
		List <WebElement> CheckBoxes = driver.findElements(By.xpath("//div[@id='checkboxes']"));
		
		Thread.sleep(1000);
		
		for(WebElement wb : CheckBoxes) {
			wb.click();
		}
		
		

	}

}
