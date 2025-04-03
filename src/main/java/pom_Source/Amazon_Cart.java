package pom_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Cart 
{
	@FindBy(xpath="//span[@class='a-icon a-icon-small-trash']")
	WebElement removeFromCart;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountAndLists;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signOut;
	
	public void removeFromCart()
	{
		removeFromCart.click();
	}
	
	public void hoveroverOnAccountsAndList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAndLists).perform();
	}
	
	public void clickOnSignOut()
	{
		signOut.click();
	}
	
	public Amazon_Cart(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
	}
}
