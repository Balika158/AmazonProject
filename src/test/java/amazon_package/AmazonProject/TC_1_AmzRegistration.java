package amazon_package.AmazonProject;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC_1_AmzRegistration extends BaseClass{
	
	@Test
	public void registration() throws InterruptedException
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		home.startHereClick();
		
		AmzRegistrationPage registration  = new AmzRegistrationPage(driver);
		registration.emailSendkeys();
		registration.continueClick();
		registration.proceedBtnClick();
		registration.mobileNumberSendKeys();
		registration.fullNameSendKeys();
		registration.passwordSendKeys();
		registration.verifyMobBtnClick();
		Thread.sleep(25000);
		registration.verifyUsingWpBtn();
		Thread.sleep(25000);
		registration.createYourAmazonAccountBtnClick();
		
		
	}
}