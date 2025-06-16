package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC_6_AmzFilters extends BaseClass{
	
	@Test
	public void filterProducts()
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		
		AmzLoginPage login = new AmzLoginPage(driver);
		login.signInBtnClick(driver);
		login.emailInputSendKeys();
		login.continueBtnClick();
		login.passwordInputSendkeys();
		login.signInSubmitBtnClick(driver);
		
		home.searchBoxSendKeys();
		
	}
}
