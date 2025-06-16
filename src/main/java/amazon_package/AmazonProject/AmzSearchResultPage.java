package amazon_package.AmazonProject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmzSearchResultPage{
	@FindBy(xpath="(//button[.='Add to cart'])[1]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="(//div[@class='a-row a-size-medium']//button)[1]")
	WebElement addToCartBtnOnPopup;
	
	@FindBy(xpath="//img[@class=\"s-image\"]")
	List<WebElement> products;
	
	//Set<WebElement> averageCustomerReviews
	public void clickOnFirstProduct(WebDriver driver)
	{
		System.out.println(products);
		WebElement firstProduct = products.get(0);
		Point p = firstProduct.getLocation();
		int y   = p.getY();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		firstProduct.click();
		
		Set<String> allWindows = driver.getWindowHandles();
		Iterator i1 = allWindows.iterator();
		
		String pWindow =  (String) i1.next();
		String cWindow =  (String) i1.next();
		
		driver.switchTo().window(cWindow);
	}

	//step 3
	public AmzSearchResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
