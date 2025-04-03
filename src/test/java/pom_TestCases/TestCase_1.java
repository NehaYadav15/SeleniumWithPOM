package pom_TestCases;

import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import pom_Source.Amazon_Home_Page;
import pom_Source.Amazon_Login_Page;
import pom_Source.Amazon_SearchResultPage;
import pom_Source.Amazon_ShoppingCart;

public class TestCase_1 extends Launch_Quit
{
    @Test
    public void login_search_wishlist_cart_logout()
    {
    	Amazon_Home_Page home_page=new Amazon_Home_Page(driver);
    	home_page.hoveroverOnAccountsAndList(driver);
    	home_page.clickOnSignIn();
    	
    	Amazon_Login_Page login_page=new Amazon_Login_Page(driver);
	     login_page.usernameTextField();
	     login_page.clickOnContinue();
	     login_page.passwordTextField();
	     login_page.clickOnSignIn();
	     home_page.searchTheProduct();
	     
	     Amazon_SearchResultPage searchPage=new Amazon_SearchResultPage(driver);
	     searchPage.clickOnFirstElement();
	     
	     Set<String> pcid=driver.getWindowHandles();
	        System.out.println(pcid);
	        //driver.close();
	        Iterator<String> i2=pcid.iterator();
	        String pid=i2.next();
	        String cid=i2.next();
	        System.out.println(pid);
	        System.out.println(cid);
	        driver.switchTo().window(cid);
	        
	     searchPage.clickOnAddToWishlist();
	     searchPage.clickOnViewWishlist();
	     searchPage.clickOnAddToCart();
	     searchPage.clickOnViewCart();
	     
	     Amazon_ShoppingCart shoppingCart=new Amazon_ShoppingCart(driver);
	     //shoppingCart.clickOnProceedToBuy();
	     shoppingCart.hoveroverOnAccountsAndList(driver);
	     
	     shoppingCart.clickOnSignOut();
	     
//	     Set<String> pcid_2=driver.getWindowHandles();
//	        System.out.println(pcid);
//	        //driver.close();
//	        Iterator<String> i3=pcid.iterator();
//	        String pid_2=i3.next();
//	        String cid_2=i3.next();
//	        System.out.println(pid_2);
//	        System.out.println(cid_2);
//	        driver.switchTo().window(cid_2);
	        
	    // shoppingCart.clickOnDeliverToThisAddress();
	     
//	     Set<String> pcid_3=driver.getWindowHandles();
//	        System.out.println(pcid);
//	        //driver.close();
//	        Iterator<String> i4=pcid.iterator();
//	        String pid_3=i4.next();
//	        String cid_3=i4.next();
//	        System.out.println(pid_3);
//	        System.out.println(cid_3);
//	        driver.switchTo().window(cid_3);
	     
	     //shoppingCart.clickOnContinueButton();
    }
}
