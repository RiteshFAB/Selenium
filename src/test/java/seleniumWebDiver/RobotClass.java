package seleniumWebDiver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RobotClass {

	
	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		
		WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Ritesh");
		
		Robot R=new Robot();
		
		R.keyPress(KeyEvent.VK_TAB);
		
		R.delay(2000);
		
		R.keyPress(KeyEvent.VK_ENTER);
		
		R.delay(5000);
		
		driver.quit();
		
	}
}
