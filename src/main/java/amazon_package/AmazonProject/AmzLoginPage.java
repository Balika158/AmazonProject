package amazon_package.AmazonProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AmzLoginPage {

	@FindBy(xpath="//span[.=\"Sign in\"]")
	WebElement signInBtn;//ap_email_login
	
	@FindBy(xpath="//input[@id=\"ap_email_login\"]")
	WebElement emailInput;
	
	@FindBy(xpath="//span[@id=\"continue\"]")
	WebElement continueBtn; 
	
	@FindBy(id="ap_password")
	WebElement passwordInput;
	
	@FindBy(id="signInSubmit")
	WebElement signInSubmitBtn;
	
	
	public void signInBtnClick(WebDriver driver)
	{
		signInBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("https://www.amazon.in/ap/signin"));
		
	}
	
	public void emailInputSendKeys()
	{
		emailInput.sendKeys("balikaaher85@gmail.com");
		
	}
	public void emailInputSendKeysWithInvalidEmail()
	{
		emailInput.sendKeys("balikaaher8566@gmail.com");
		
	}
	public void emailInputSendKeysForLoginWithDataprovider(String username) 
	{
		emailInput.sendKeys(username);
	}
	
	public void continueBtnClick()
	{
		continueBtn.click();
	}
	
	public void continueBtnClickForInvalidEmail()
	{
		continueBtn.click();
		boolean isPwdInputPresent = false;
		try
		{
			if(passwordInput.isDisplayed());
			{
				isPwdInputPresent = true;
			}
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			isPwdInputPresent = false;
		}
		
		Assert.assertEquals(isPwdInputPresent, false);
		
	}
	
	public void passwordInputSendkeys()
	{
		try {
			passwordInput.sendKeys("bsw@150797");
		}
		catch(org.openqa.selenium.NoSuchElementException e)
		{
			
		}
	}
	
	public void passwordInputSendkeysForInvalidPassword()
	{
		passwordInput.sendKeys("bsw@15797");
	}
	
	public void passwordInputSendkeysForLoginWithDataprovider(String password)
	{
		passwordInput.sendKeys(password);
	}
	
	public void signInSubmitBtnClick(WebDriver driver)
	{
		signInSubmitBtn.click();
	}
	
	public AmzLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
