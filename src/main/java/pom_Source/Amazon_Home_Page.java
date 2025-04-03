package pom_Source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	WebDriver driver;
	//Step-1
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountAndLists;
	
	@FindBy(xpath="(//span[.='Sign in'])[1]")
	WebElement signIn;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement searchProduct;
	
	@FindBy(xpath="//span[.='Your Account']")
	WebElement yourAccount;
	
	//Step-2
	public void hoveroverOnAccountsAndList(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAndLists).perform();
	}
	
	public void clickOnSignIn()
	{
		signIn.click();
	}
	
	public void searchTheProduct()
	{
		searchProduct.sendKeys("Mobiles"+Keys.ENTER);
	}
	
	public void clickOnYourAccount(WebDriver driver)
	{
		Actions a1=new Actions(driver);
		a1.moveToElement(accountAndLists).perform();
		yourAccount.click();
	}
	
	//Step-3
	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
