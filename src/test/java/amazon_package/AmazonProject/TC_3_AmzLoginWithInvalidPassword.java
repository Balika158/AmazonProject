package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_3_AmzLoginWithInvalidPassword extends BaseClass{

	@Test
	public void loginWithInvalidPassword() throws InterruptedException
	{
		AmzHomePage home = new AmzHomePage(driver);
		home.accountAndListHoverOver(driver);
		
		AmzLoginPage login = new AmzLoginPage(driver);
		login.signInBtnClick(driver);
		login.emailInputSendKeys();
		login.continueBtnClick();
		login.passwordInputSendkeysForInvalidPassword();
		login.signInSubmitBtnClick(driver);
		Thread.sleep(30000);
		Assert.assertEquals(driver.getTitle(), "Amazon Sign In");
	}
}
