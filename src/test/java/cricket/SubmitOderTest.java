package cricket;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cricket.TestComponents.BaseTest;
import cricket.pageobjects.CartPage;
import cricket.pageobjects.CheckOutPage;
import cricket.pageobjects.LandingPage;
import cricket.pageobjects.OrderPage;
import cricket.pageobjects.ProductCatlogue;
import cricket.pageobjects.confimationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOderTest extends BaseTest {
	String ProductName = "ZARA COAT 3";

	// public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	@Test(dataProvider="getData", groups= {"purchase"})
	public void submitorder(HashMap<String, String> input) throws IOException, InterruptedException {
	
		
		ProductCatlogue productCatlogue = landingpage.loginApplication(input.get("email"),input.get("password"));

		List<WebElement> products = productCatlogue.getProductList();
		productCatlogue.addProductToCart(input.get("product"));
		CartPage cartpage = productCatlogue.goToCartPage();

		Boolean match = cartpage.VerifyProductDisplay(input.get("product"));
		Assert.assertTrue(match);
		CheckOutPage checkoutpage = cartpage.goToCheckout();
		checkoutpage.selectcountry("india");
		confimationPage confimationPage = checkoutpage.submitOrder(); // confimationPage

		String confirmation = confimationPage.getConfirmationMessage();
		Assert.assertTrue(confirmation.equalsIgnoreCase("Thankyou for the order."));
		
	}
	@Test(dependsOnMethods= {"submitorder"})
	public void OrderHistory() {
	ProductCatlogue productCatlogue = landingpage.loginApplication("virat188@gmail.com", "GAUrav@123");
	
	OrderPage orderpage = productCatlogue.goToOrderPage();
	Assert.assertTrue(orderpage.VerifyOrderDisplay(ProductName));
	}
	
	
	public String getScreenShot(String testCaseName) throws IOException
	{
	TakesScreenshot ts =(TakesScreenshot)driver;
	File source =ts.getScreenshotAs(OutputType.FILE);
	File file = new File(System.getProperty("user.dir")+"//reports" + testCaseName+ ".png");
	FileUtils.copyFile(source, source);
	
	return  (System.getProperty("user.dir")+"//reports" + testCaseName+ ".png");
	
	
	}
	@DataProvider	
	public Object[][] getData()
	{
		HashMap<String,String> map = new HashMap<String,String> ();
		map.put("email","virat188@gmail.com");
	map.put("password", "GAUrav@123");
		map.put("product", "ZARA COAT 3");
		
		
		HashMap<String,String> map1 = new HashMap<String,String> ();
		map1.put("email","virat188@gmail.com");
		map1.put("password", "GAUrav@123");
		map1.put("product", "IPHONE 13 PRO");
		
		
		//getJsonDataToMap();  this used to base test class some issue this failed but i undo this code and show also same base class
		return new Object [][] {{map},{map1}};
	}
}
