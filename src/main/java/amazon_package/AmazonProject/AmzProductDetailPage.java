package amazon_package.AmazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmzProductDetailPage {

	@FindBy(id="title_feature_div")
	WebElement titleDiv;
	
	@FindBy(id="averageCustomerReviews_feature_div")
	WebElement CustomerReviews;
	
	@FindBy(id="corePriceDisplay_desktop_feature_div")
	WebElement price;
	
	@FindBy(id="add-to-cart-button")
	WebElement addToCartBtn;
	
	@FindBy(linkText="Go to Cart")
	WebElement goToCartBtn;
	
	//Go to Cart 
	
	public void descriptionDivIsDisplayed()
	{
		
		
	}
	public void customerReviewsIsDisplayed()
	{
		
	}
	public void priceIsDisplayed()
	{
		
	}
	
	public void addToCartBtnClick()
	{
		addToCartBtn.click();
	}
	
	public void goToCartBtnClick()
	{
		goToCartBtn.click();
	}
	
	public AmzProductDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this); 
	}
}
