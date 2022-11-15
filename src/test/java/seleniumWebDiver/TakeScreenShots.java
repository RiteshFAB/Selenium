package seleniumWebDiver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShots {

	public static void main(String[] args) throws  Exception {
	WebDriverManager.chromedriver().setup();	
	WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("riteshk402@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Samsung@12");	
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File Target=new File(".\\Report\\facbook2.png");
		
		FileUtils.copyFile(screenshot, Target);
		Thread.sleep(5000);
		driver.quit();
	}
}
