package cricket;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import cricket.TestComponents.BaseTest;
import cricket.pageobjects.CartPage;
import cricket.pageobjects.CheckOutPage;
import cricket.pageobjects.ProductCatlogue;
import cricket.pageobjects.confimationPage;

public class ErrorValidation extends BaseTest {

	// public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	@Test(groups = {"ErrorHandeling"} )//ths method recheck again but right noe failed so that why i skipped  //retryAnalyzer=Retry.class);
	public void LoginErrorValidation() throws IOException, InterruptedException {
		//String ProductName = "ZARA COAT 3";
		
		 landingpage.loginApplication("virat1881@gmail.com", "GAUrav@1231");
		 Assert.assertEquals("Incorrect email, password.",landingpage.getErromessage());
	}

	
	@Test
	public void ProductErrorValidationTest() throws IOException, InterruptedException {
		String ProductName = "ZARA COAT 3";
		
		ProductCatlogue productCatlogue = landingpage.loginApplication("virat188@gmail.com", "GAUrav@123");

		List<WebElement> products = productCatlogue.getProductList();
		productCatlogue.addProductToCart(ProductName);
		CartPage cartpage = productCatlogue.goToCartPage();

		Boolean match = cartpage.VerifyProductDisplay(ProductName);
		Assert.assertTrue(match);
	}
}
