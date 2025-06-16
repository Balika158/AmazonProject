package amazon_package.AmazonProject;

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
	
	public void loginAndSecurityCardClick()
	{
		loginAndSecurityCard.click();
	}
	
	public void optInputSendKeys()
	{
		//optInput.sendKeys("107306");
	}
	
	public void submitCodeBtnClick()
	{
		submitCodeBtn.click();
	}
	
	public AmzProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
