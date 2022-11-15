package seleniumWebDiver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
       WebElement filePath=driver.findElement(By.xpath("(//input[@type='file'])[1]"));
              
       filePath.sendKeys("C:\\Users\\cc\\Desktop\\FileUpload\\Ritesh.pdf");
       
       Thread.sleep(40000);
       
       driver.quit();
	}
}
