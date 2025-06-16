package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC_1_AmzRegistration extends BaseClass{
	
	@Test
	public void registration()
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		home.startHereClick();
		
		AmzRegistrationPage registration  = new AmzRegistrationPage(driver);
		registration.emailSendkeys();
		registration.continueClick();
		registration.proceedBtnClick();
		//registration.signInSubmitBtnClick();
		//mobileNumberSendKeys fullNameSendKeys passwordSendKeys verifyMobBtnClick
		registration.mobileNumberSendKeys();
		registration.fullNameSendKeys();
		registration.passwordSendKeys();
		registration.verifyMobBtnClick();
	}
}