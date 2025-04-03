package pom_TestCases;

import org.testng.annotations.Test;

import pom_Source.Amazon_Cart;
import pom_Source.Amazon_Home_Page;
import pom_Source.Amazon_Login_Page;
import pom_Source.Amazon_Your_Account;

public class TestCase_3 extends Launch_Quit
{
	@Test
	public void login_search_wishlist_removeFromCart_logout()
	{
		Amazon_Home_Page home_page=new Amazon_Home_Page(driver);
    	home_page.hoveroverOnAccountsAndList(driver);
    	home_page.clickOnSignIn();
    	
    	Amazon_Login_Page login_page=new Amazon_Login_Page(driver);
	     login_page.usernameTextField();
	     login_page.clickOnContinue();
	     login_page.passwordTextField();
	     login_page.clickOnSignIn();
	     home_page.clickOnYourAccount(driver);
	     
	     Amazon_Your_Account youraccount=new Amazon_Your_Account(driver);
	     youraccount.clickOnYourAddress();
	     youraccount.clickOnEdit();
	     youraccount.goToFullNameTextField();
	     youraccount.goToApartmentTextField();
	     
	     Amazon_Cart cart=new Amazon_Cart(driver);
	     cart.hoveroverOnAccountsAndList(driver);
	     cart.clickOnSignOut();
	}  
}
