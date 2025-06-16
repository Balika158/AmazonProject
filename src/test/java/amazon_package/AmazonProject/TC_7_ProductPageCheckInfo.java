package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_7_ProductPageCheckInfo extends BaseClass{

	@Test
	public void checkInfo()
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
		
		AmzProductDetailPage pDetails = new AmzProductDetailPage(driver);
		pDetails.descriptionDivIsDisplayed();
		pDetails.customerReviewsIsDisplayed();
		pDetails.priceIsDisplayed();
	}
}
