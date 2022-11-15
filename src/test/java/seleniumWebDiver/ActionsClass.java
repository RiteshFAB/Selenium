package seleniumWebDiver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://learn-automation.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		WebElement programmingLang=	driver.findElement(By.xpath("//span[text()='Programming Languages']"));

		Actions A= new Actions(driver);
		WebElement javaTutorial=driver.findElement(By.xpath("//span[text()='Java Tutorials']"));
		A.moveToElement(programmingLang).build().perform();
		A.moveToElement(javaTutorial).click().build().perform();

		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

		TakesScreenshot ts=(TakesScreenshot)driver;

		File sourceFile=ts.getScreenshotAs(OutputType.FILE);

		File destnationFile=new File(".//Report//mukesh.png");

		FileUtils.copyFile(sourceFile, destnationFile);

		


		Thread.sleep(8000);









		driver.quit();

	}
}
