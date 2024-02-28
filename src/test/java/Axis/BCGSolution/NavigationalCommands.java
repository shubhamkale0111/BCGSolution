package Axis.BCGSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
		driver.navigate().forward();

		
		driver.navigate().back();
		

		
		driver.navigate().refresh();
		
		driver.close();
		

	}

}
