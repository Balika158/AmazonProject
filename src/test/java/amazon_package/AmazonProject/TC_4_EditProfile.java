package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC_4_EditProfile extends BaseClass{

	@Test
	public void editProfile() throws InterruptedException
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		
		AmzLoginPage login = new AmzLoginPage(driver);
		login.signInBtnClick(driver);
		login.emailInputSendKeys();
		login.continueBtnClick();
		login.passwordInputSendkeys();
		login.signInSubmitBtnClick(driver);
		
		home.accountAndListHoverOver(driver);
		home.yourAccountLink();
		
		AmzProfilePage profile = new AmzProfilePage(driver);
		profile.loginAndSecurityCardClick();
		Thread.sleep(20000);
		profile.nameEditBtnClick();
		profile.newNameSendkeys();
		profile.newNameSaveChangesBtnClick();
		profile.emailEditBtnClick();
		profile.newEmailInputSendkeys();
		profile.continueBtnFromNewEmailClick();
		
		Thread.sleep(20000);
		profile.pwdEditBtnClick();
	}
}
