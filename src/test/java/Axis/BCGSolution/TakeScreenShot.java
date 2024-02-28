package Axis.BCGSolution;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver-win64\\chromedriver-win64/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		Files.copy(f, new File("C:\\Users\\DELL\\Desktop\\Axis QA\\New folder\\screenshot.png"));
		
		System.out.println("The Screenshot is captured");
	}

}
