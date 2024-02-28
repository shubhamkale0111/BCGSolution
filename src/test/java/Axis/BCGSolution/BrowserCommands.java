package Axis.BCGSolution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://automationexercise.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String cururl = driver.getCurrentUrl();
		
		System.out.println(cururl);
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		driver.close();
	}

}
