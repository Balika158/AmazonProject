package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC_3_AmzLoginWithInvalidEmail extends BaseClass{

	@Test
	public void loginWithInvalidEmail()
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		
		AmzLoginPage login = new AmzLoginPage(driver);
		login.signInBtnClick(driver);
		login.emailInputSendKeysWithInvalidEmail();
		login.continueBtnClickForInvalidEmail();
		
	}
}
