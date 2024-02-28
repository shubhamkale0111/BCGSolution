package Axis.BackTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BroserCommands {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String cururl = driver.getCurrentUrl();
		
		System.out.println(cururl);
		
		String pagesource = driver.getPageSource();
		
		System.out.println(pagesource);
		
		driver.close();

	}

}
