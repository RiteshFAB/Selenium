package seleniumWebDiver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\cc\\Desktop\\Test Case Template New.xls");
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		XSSFSheet Sheet=workBook.getSheetAt(0);
		
		int lastRowNum = Sheet.getLastRowNum();
		int lastCell=Sheet.getRow(0).getLastCellNum();
		
		
		for(int i=0;i<lastRowNum;i++) {
			
			XSSFRow row = Sheet.getRow(i);
			System.out.println(row);
			for(int a=0;a<lastCell;a++) {
				XSSFCell cell = Sheet.getRow(i).getCell(a);
				System.out.println(cell.getStringCellValue());
			}
		}
		
	}
}
