package amazon_package.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzProfilePage {

	@FindBy(xpath="//div[@data-card-identifier=\"SignInAndSecurity\"]")
	WebElement loginAndSecurityCard;
	
	@FindBy(id="input-box-otp")
	WebElement optInput;
	
	@FindBy(xpath="//span[.=\"Submit code\"]")
	WebElement submitCodeBtn;
	
	@FindBy(id="NAME_BUTTON")
	WebElement nameEditBtn;
	
	@FindBy(id="ap_customer_name")
	WebElement newNameInput;
	
	@FindBy(id="cnep_1C_submit_button")
	WebElement newNameSaveChangesBtn;
	
	@FindBy(id="EMAIL_BUTTON")
	WebElement emailEditBtn;
	
	@FindBy(id="cvfEmail")
	WebElement newEmailInput;
	
	@FindBy(name="cvf_action")
	WebElement continueBtnFromNewEmail;
	
	@FindBy(id="PASSWORD_BUTTON")
	WebElement pwdEditBtn;
	
	public void loginAndSecurityCardClick()
	{
		loginAndSecurityCard.click();
	}

	public void nameEditBtnClick()
	{
		nameEditBtn.click();
	}
	
	public void newNameSendkeys()
	{
		newNameInput.sendKeys(Keys.COMMAND+"A");
		newNameInput.sendKeys(Keys.BACK_SPACE);
		newNameInput.sendKeys("Ojas Warale");
	}
	
	public void newNameSaveChangesBtnClick()
	{
		newNameSaveChangesBtn.click();
	}
	public void emailEditBtnClick()
	{
		emailEditBtn.click();
	}
	
	public void newEmailInputSendkeys()
	{
		newEmailInput.sendKeys("balikaaher97@gmail.com");
	}
	
	public void continueBtnFromNewEmailClick()
	{
		continueBtnFromNewEmail.click();
	}
	
	public void pwdEditBtnClick()
	{
		pwdEditBtn.click();
	}
	public AmzProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
