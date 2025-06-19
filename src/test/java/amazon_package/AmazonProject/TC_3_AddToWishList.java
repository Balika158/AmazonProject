package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC_3_AddToWishList extends BaseClass{

	@Test
	public void addToWishList()
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
		
		AmzSearchResultPage product = new AmzSearchResultPage(driver);
		product.clickOnFirstProduct(driver);
		//product.addFirstProductToWishList(driver);
		
		//AmzProductOnNewPage np = new AmzProductOnNewPage(driver);
		//np.addToWishListBtnClick();
		
		//AddToWishListPAge wp = new AddToWishListPAge(driver);
		//wp.clickOnCloseBtn();
	}
	
	
}
