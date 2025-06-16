package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3_AmzLoginWithInvalidPassword extends BaseClass{

	@Test
	public void loginWithInvalidPassword()
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		
		AmzLoginPage login = new AmzLoginPage(driver);
		login.signInBtnClick(driver);
		login.emailInputSendKeys();
		login.continueBtnClick();
		login.passwordInputSendkeysForInvalidPassword();
		login.signInSubmitBtnClick(driver);
		AssertJUnit.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
}
