package pom_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResultPage 
{
	WebDriver driver;
	//Step-1
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[2]")
	WebElement firstElement;
	
	@FindBy(id="add-to-wishlist-button-submit")
	WebElement addToWishlist;
	
	@FindBy(linkText="View Your List")
	WebElement viewWishlist;
	
	@FindBy(linkText="Add to Cart")
	WebElement addToCart;
	
	@FindBy(xpath="//span[@class='a-button a-button-base g-cart-view-btn ul-add-to-cart-response-fragment-bottom-section-buttons']")
	WebElement viewCart;
	
	
	public void clickOnFirstElement()
	{
		firstElement.click();
	}
	
	public void clickOnAddToWishlist()
	{
		addToWishlist.click();
	}
	
	public void clickOnViewWishlist()
	{
		viewWishlist.click();
	}
	
	public void clickOnAddToCart()
	{
		addToCart.click();
	}
	
	public void clickOnViewCart()
	{
		viewCart.click();
	}
	
    
	//Step-3
		public Amazon_SearchResultPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
}
