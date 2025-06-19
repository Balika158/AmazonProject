package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_9_AmzAddToCart extends BaseClass{

	@Test
	public void addToCart()
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
		
		AmzSearchResultPage result = new AmzSearchResultPage(driver);
		result.clickOnFirstProduct(driver);
		
		AmzProductDetailPage details = new AmzProductDetailPage(driver);
		details.addToCartBtnClick();
		
		AssertJUnit.assertEquals(driver.getTitle(), "Amazon.in Shopping Cart");
		
	}
}
