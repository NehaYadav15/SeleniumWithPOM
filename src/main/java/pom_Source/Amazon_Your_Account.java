package pom_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Your_Account 
{
	@FindBy(xpath="//span[.='Edit addresses for orders and gifts']")
	WebElement yourAddress;
	
	@FindBy(id="ya-myab-address-edit-btn-1")
	WebElement edit;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement editFullName;
	
	@FindBy(xpath="//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement editApartment;
	
	public void clickOnYourAddress()
	{
		yourAddress.click();
	}
	
	public void clickOnEdit()
	{
		edit.click();
	}
	
	public void goToFullNameTextField()
	{
		editFullName.clear();
		editFullName.sendKeys("Neha");
	}
	
	public void goToApartmentTextField()
	{
		editApartment.clear();
		editApartment.sendKeys("D-114,Shivalik Nagar,NTPC Township");
	}
	
	public Amazon_Your_Account(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
