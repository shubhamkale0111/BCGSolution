package Axis.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandle {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement chkbox2 = driver.findElement(By.xpath("//input[@type= 'checkbox'][2]"));
		
		if(chkbox2.isEnabled()) {
			chkbox2.click();
			
		}
		
		WebElement chkbox1 = driver.findElement(By.xpath("//input[@type= 'checkbox'][1]"));
		
		if(chkbox1.isEnabled()) {
			chkbox1.click();
			
		}


	}

}
