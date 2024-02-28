package Axis.BCGSolution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDranAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		// drab and drop
		 
				WebElement src = driver.findElement(By.xpath("//div[@id='column-a']"));
		 
				WebElement dest = driver.findElement(By.xpath("//div[@id='column-b']"));
		 
				Actions builder = new Actions(driver);
		 
				builder.dragAndDrop(src, dest).perform();
		 
				System.out.println("The item dragged and dropped");

	}

}
