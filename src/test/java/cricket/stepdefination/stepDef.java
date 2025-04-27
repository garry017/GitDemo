package cricket.stepdefination;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cricket.pageobjects.CartPage;
import cricket.pageobjects.CheckOutPage;
import cricket.pageobjects.ProductCatlogue;
import cricket.pageobjects.confimationPage;

public class stepDef extends BaseTest
{
	public LandingPage landingpage;
	 public ProductCatlogue productCatlogue;
	 public confimationPage confimationPage;
	@Given ("I landed  on ecommerce website ")
	public void I_landed_on_ecommerce_website()
	{
	landingpage = launchApllication()
	}
    
	 @Given ("logged in with username(.+) and password (.+) $ ")
	 public void  logged_in_with_username_and_password( String username, String password) 
	 {
		 productCatlogue = landingpage.loginApplication(username, password);
    }
	 @When ("^I add a product (.+) to cart $") // regular exp start with cap and end with doller
	 public void I_add_product_to_cart(String ProductName )
	 {
		 List<WebElement> products = productCatlogue.getProductList();
			productCatlogue.addProductToCart(ProductName);
	 }
	 
	 @when (" ^Checkout (.+) and submit order$")
	 public void Checkout_submit_order(String ProductName)
	 {
		 CartPage cartpage = productCatlogue.goToCartPage();

			Boolean match = cartpage.VerifyProductDisplay(ProductName);
			Assert.assertTrue(match);
			CheckOutPage checkoutpage = cartpage.goToCheckout();
			checkoutpage.selectcountry("india");
			 confimationPage = checkoutpage.submitOrder(); 
	 }
	    
	    @Then ("{String} message displayed on confirmationPage
       public void message_displayed_on_confirmationPage(String string)

       {
    	   String confirmation = confimationPage.getConfirmationMessage();
   		Assert.assertTrue(confirmation.equalsIgnoreCase(string)); 
       }

      @Then("^\"([^\"]*)\" message is displayed$")
      public void something_message_is_display_(string) throws Throwable{
    	  Assert.assertEquals(string,landingpage.getErromessage());
      }

}   

