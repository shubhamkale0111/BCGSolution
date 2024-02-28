package Axis.BackTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Program Files\\Mozilla Firefox\\firefox.exe");

		driver = new FirefoxDriver();
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("C:\\Users\\DELL\\Desktop\\Axis QA\\New folder\\screenshot.png"));
		
		System.out.println("The Screenshot is captured");

	}

}
