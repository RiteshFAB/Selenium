package seleniumWebDiver;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		
		WebElement day=driver.findElement(By.xpath("//select[@title='Day']"));
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		WebElement year=driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select S= new Select(day);
		S.selectByValue("1");
		
		Select S1= new Select(month);
		S1.selectByIndex(5);
		
		Select S2=new Select(year);
		S2.selectByVisibleText("1992");
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		File target=new File(".//Report//DOB.png");
		
		
		FileUtils.copyFile(source, target);
		
		System.out.println("Screen Shot taken successfully");
		Thread.sleep(4000);
		
		
		WebElement devp=driver.findElement(By.xpath("//a[text()='Developers']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", devp);
		
		Thread.sleep(5000);
	}
}
