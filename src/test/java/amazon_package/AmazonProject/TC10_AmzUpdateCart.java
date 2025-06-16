package amazon_package.AmazonProject;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TC10_AmzUpdateCart extends BaseClass{
	@Test
	public void updateCart()
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
		details.goToCartBtnClick();
		
		AmzShoppingCartPage cart = new AmzShoppingCartPage(driver);
		
		//cart.increaseQuantityClick();
		//cart.decreaseQuantityClick();
		cart.deleteFromCartClick();
		
	}
}
