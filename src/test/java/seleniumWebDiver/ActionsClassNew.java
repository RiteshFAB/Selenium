package seleniumWebDiver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassNew {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://learn-automation.com/");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		Actions A =new Actions(driver);
		WebElement programmingLang=	driver.findElement(By.xpath("//span[text()='Programming Languages']"));

		A.contextClick().build().perform();
		Thread.sleep(5000);
		
		A.doubleClick(programmingLang).build().perform();
		
	//	A.dragAndDrop(source, target)
	}
}
