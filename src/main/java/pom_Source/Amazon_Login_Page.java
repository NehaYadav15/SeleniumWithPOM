package pom_Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page 
{
	WebDriver driver;
	//Step-1
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="continue")
	WebElement continue_Button;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="(//span[@class='a-button-inner'])[1]")
	WebElement signIn_Button;
	
	//Step-2
	public void usernameTextField()
	{
		username.sendKeys("9583495508");
	}
	
	public void clickOnContinue()
	{
		continue_Button.click();
	}
	
	public void passwordTextField()
	{
		password.sendKeys("Amazon12");
	}
	
	public void clickOnSignIn()
	{
		signIn_Button.click();
	}
	
	//Step-3
	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
