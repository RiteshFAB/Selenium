package seleniumWebDiver;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicLocator {

	
	public static void main(String[] args) throws IOException, Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2021/08/");

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

		List<WebElement> table=	driver.findElements(By.xpath("//table//tbody//tr//td"));

		System.out.println(table.get(2).getText());

		for(int a = 0;a<table.size();a++) {

			System.out.println(table.get(a).getText());
		}
		Thread.sleep(4000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement selenium=driver.findElement(By.xpath("//table//tbody//tr//td[text()='Selenium']//preceding-sibling::td//input"));
		js.executeScript("arguments[0].click();", selenium);
		Thread.sleep(8000);
		WebElement selenium2=	driver.findElement(By.xpath("//table//tbody//tr//td[text()='Selenium']//following::td[4]//input"));
		js.executeScript("arguments[0].click();", selenium2);
		Thread.sleep(8000);

		WebElement selenium3=	driver.findElement(By.xpath("//table//tbody//tr//td[text()='Selenium']//following-sibling::td[3]//a"));
		js.executeScript("arguments[0].click();",selenium3);
		Thread.sleep(8000);

		driver.quit();
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
