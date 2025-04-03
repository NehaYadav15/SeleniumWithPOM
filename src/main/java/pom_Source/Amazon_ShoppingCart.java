package pom_Source;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_ShoppingCart 
{
	WebDriver driver;
	//Step-1
//	@FindBy(name="proceedToRetailCheckout")
//	WebElement proceedToBuy;
	
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountAndLists;
	
	@FindBy(xpath="//span[.='Sign Out']")
	WebElement signOut;
	
//	@FindBy(xpath="(//input[@class='a-button-input'])[2]")
//	WebElement deliverToThisAddress;
//	
//	@FindBy(xpath="(//input[@class='a-button-input'])[1]")
//	WebElement continue_Button;
	
	//Step-2
//	public void clickOnProceedToBuy()
//	{
//		proceedToBuy.click();
//	}
	
	public void hoveroverOnAccountsAndList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAndLists).perform();
	}
	
	public void clickOnSignOut()
	{
		signOut.click();
	}
	
//	public void clickOnDeliverToThisAddress()
//	{
//		deliverToThisAddress.click();
//	}
//	
//	public void clickOnContinueButton()
//	{
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.titleIs("Google"));
//		continue_Button.click();
//	}
	
	//Step-3
    public Amazon_ShoppingCart(WebDriver driver)
	{
	    PageFactory.initElements(driver, this);
	}
}
