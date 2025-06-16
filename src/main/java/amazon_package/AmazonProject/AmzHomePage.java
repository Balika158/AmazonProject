package amazon_package.AmazonProject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzHomePage {
	@FindBy(xpath="//div[@id=\"nav-link-accountList\"]")
	WebElement accountAndLists;
	
	@FindBy(linkText="Start here.")
	WebElement startHere;
	
	@FindBy(xpath="//span[.=\"Your Account\"]")
	WebElement yourAccountLink;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchBox;
	
	public void accountAndListHoverOver(WebDriver driver)
	{
		Actions a1= new Actions(driver);
		a1.moveToElement(accountAndLists).perform();
	}
	
	public void startHereClick()
	{
		startHere.click();
	}
	
	public void yourAccountLink()
	{
		yourAccountLink.click();
	}
	
	public void searchBoxSendKeys()
	{
		searchBox.sendKeys("Shoe"+Keys.ENTER);
	}
	
	public AmzHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
