package amazon_package.AmazonProject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {

	
	WebDriver driver;
	@BeforeMethod
	public void launchUrl()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	}
	
}
