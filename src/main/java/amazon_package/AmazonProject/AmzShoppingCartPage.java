package amazon_package.AmazonProject;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzShoppingCartPage {

	//@FindBy(xpath="//button[@aria-label=\"Decrease quantity by one\"]")
	//WebElement decreaseQuantity;
	
	//@FindBy(xpath="//button[@data-action=\"a-stepper-increment\"]")
	//WebElement increaseQuantity;
	
	@FindBy(name="quantityBox")	//quantityBox
	WebElement quantityBox;
	
	@FindBy(xpath="//div[@data-action=\"delete-active")
	WebElement deleteFromCart;
	
	//Increase quantity by one
	public void decreaseQuantityClick()
	{
		//decreaseQuantity.click();
	}
	public void increaseQuantityClick()
	{
		//increaseQuantity.click();
	}
	
	public void quantityBoxSendKeys(WebDriver driver)
	{
		int quantity = Integer.parseInt(quantityBox.getDomAttribute("value"));
		System.out.println(quantity);
		
		if(quantity==10)
		{
			Actions a1 = new Actions(driver);
			a1.doubleClick(quantityBox).perform();
			
		}
		else
		{
			quantityBox.sendKeys("7");
		}
	}
	public void deleteFromCartClick()
	{
		deleteFromCart.click();
	}
	public AmzShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
