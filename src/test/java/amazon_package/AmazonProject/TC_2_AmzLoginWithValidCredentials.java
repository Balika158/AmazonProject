package amazon_package.AmazonProject;

import org.testng.annotations.Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_2_AmzLoginWithValidCredentials extends BaseClass{

	@DataProvider(name="amzLoginTestData")
	public Object[][] loginData() throws EncryptedDocumentException, IOException
	{
		Object [][] data = new Object[2][2];
		
		FileInputStream f1 = new FileInputStream("/Users/apple/eclipse-workspace/AmazonProject/DataFetching/AmazonLoginTestData.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		
		String username1 = wb.getSheet("LoginCredentials").getRow(1).getCell(0).getStringCellValue();
		String password1 = wb.getSheet("LoginCredentials").getRow(1).getCell(1).getStringCellValue();
		
		String username2 = NumberToTextConverter.toText(wb.getSheet("LoginCredentials").getRow(2).getCell(0).getNumericCellValue());
		String password2 = wb.getSheet("LoginCredentials").getRow(2).getCell(1).getStringCellValue();
		
		data[0][0] = username1;
		data[0][1] = password1;
		
		data[1][0] = username2;
		data[1][1] = password2;
		
		return data;
	}
	
	@Test(dataProvider="amzLoginTestData")
	public void loginWithValidCredentials(String username, String password) throws InterruptedException
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		
		AmzLoginPage login = new AmzLoginPage(driver);
		login.signInBtnClick(driver);
		login.emailInputSendKeysForLoginWithDataprovider(username); // emailInputSendKeysForLoginWithDataprovider passwordInputSendkeysForLoginWithDataprovider
		login.continueBtnClick();
		login.passwordInputSendkeysForLoginWithDataprovider(password);
		login.signInSubmitBtnClick(driver);
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains("Online"));
		//login.helloLinkTextGetValue();
		Assert.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}
	
	
}
