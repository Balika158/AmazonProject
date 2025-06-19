package amazon_package.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzRegistrationPage {

	@FindBy(id="ap_email_login")
	WebElement emailInput; 
	
	@FindBy(xpath="//span[@id=\"continue\"]")
	WebElement continueBtn;
	
	@FindBy(id="ap_password")
	WebElement passwordInput; 
	
	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	WebElement signInSubmitBtn;
	
	@FindBy(id="intention-submit-button")
	WebElement proceedBtn;
	
	@FindBy(id="ap_phone_number")
	WebElement mobileNumber;
	
	@FindBy(id="ap_customer_name")
	WebElement fullName;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement verifyMobBtn;
	
	@FindBy(xpath="//span[@id=\"cvf-submit-otp-button\"]")
	WebElement createYourAmazonAccBtn;
	
	@FindBy(xpath="//span[@id=\"secondary_channel_button\"]")
	WebElement verifyUsingWp;
	
	//continue
	public void emailSendkeys()
	{
		emailInput.sendKeys("balikaaher999@gmail.com");
	}
	
	public void continueClick()
	{
		continueBtn.click();
	}
	
	public void proceedBtnClick()
	{
		proceedBtn.click();
	}
	
	public void mobileNumberSendKeys()
	{
		mobileNumber.sendKeys("8767172289");
	}
	
	public void fullNameSendKeys()
	{
		fullName.sendKeys("Balika Aher");
	}
	
	public void passwordSendKeys()
	{
		password.sendKeys("balikaaher@123");
	}
	
	public void verifyMobBtnClick()
	{
		verifyMobBtn.click();
	}
	
	public void verifyUsingWpBtn()
	{
		verifyUsingWp.click();
	}
	public void createYourAmazonAccountBtnClick()
	{
		createYourAmazonAccBtn.click();
	}
	public AmzRegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
}
