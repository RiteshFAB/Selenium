package seleniumWebDiver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScripExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/");
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	    
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("riteshk402@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Samsung@12");	
		//driver.findElement(By.xpath("//button[@name='login']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
		JavascriptExecutor E=(JavascriptExecutor)driver;
		WebElement help=driver.findElement(By.xpath("//a[@title='Visit our Help Centre.']"));
		E.executeScript("arguments[0].scrollIntoView();",help);
		
		
		
		Thread.sleep(5000);
		
		
		driver.quit();
		
		
		
		
		
	}
}
